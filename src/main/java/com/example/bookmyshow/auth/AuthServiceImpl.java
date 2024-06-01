package com.example.bookmyshow.auth;

import com.example.bookmyshow.exception.AppRuntimeException;
import com.example.bookmyshow.model.User;
import com.example.bookmyshow.service.UserContextService;
import com.example.bookmyshow.utills.AppUtils;
import org.apache.commons.lang3.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class AuthServiceImpl implements AuthService {

    @Value("${auth.token.ttl.minutes: 60}")
    private Long authTokenTtl;

    @Autowired
    private AuthCacheClient authCacheClient;

    @Autowired
    private UserContextService userContextService;
    public Long getAuthTokenTtl() {
        return authTokenTtl;
    }

    // Setter method for authTokenTtl
    public void setAuthTokenTtl(Long authTokenTtl) {
        this.authTokenTtl = authTokenTtl;
    }

    @Override
    public String createAuthenticationContext(User user) {
        AuthenticationContext context = new AuthenticationContext();
        context.setUser(user);
        context.setUserId(user.getEmail());
        context.setHeaderTokenUUID(UUID.randomUUID().toString());
        context.setExpiryAt(authTokenTtl * 60 * 1000 + System.currentTimeMillis());
        authCacheClient.put(context.getHeaderTokenUUID(), context);
        return AppUtils.getEncodedString(context.getHeaderTokenUUID());
    }

    @Override
    public boolean destroyAuthenticationContext(String tokenStr) {
        tokenStr = StringUtils.isEmpty(tokenStr) ? StringUtils.EMPTY : AppUtils.getDecodedString(tokenStr);
        AuthenticationContext context = authCacheClient.get(tokenStr);
        if(context == null){
            log.warn("authentication context not found");
            return false;
        }
        authCacheClient.remove(context.getHeaderTokenUUID(), context.getUserId());
        log.warn("authentication context destroyed");
        return true;
    }

    @Override
    public void setUserContext(String tokenStr) {
        tokenStr = StringUtils.isEmpty(tokenStr) ? StringUtils.EMPTY : AppUtils.getDecodedString(tokenStr);
        AuthenticationContext context = authCacheClient.get(tokenStr);

        if(context == null){
            log.warn("authentication is null for token: {}", tokenStr);
            throw new AppRuntimeException("authentication context is empty");
        }

        if(System.currentTimeMillis() > context.getExpiryAt()){
            log.warn("authentication expired for user: {}", context.getUserId());
            throw new AppRuntimeException("token expired");
        }

        log.info("expiry token: {}", context.getExpiryAt());
        userContextService.setUser(context.getUser());
        log.info("user context set for user: {}", context.getUser());
    }
}
