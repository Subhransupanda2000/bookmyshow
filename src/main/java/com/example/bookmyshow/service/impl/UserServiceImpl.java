package com.example.bookmyshow.service.impl;

import com.example.bookmyshow.Repository.UserEntityRepository;
import com.example.bookmyshow.auth.AuthService;
import com.example.bookmyshow.entity.UserEntity;
import com.example.bookmyshow.exception.AppRuntimeException;
import com.example.bookmyshow.model.User;
import com.example.bookmyshow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEntityRepository userEntityRepository;

    @Autowired
    private AuthService authService;

    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public User createUser(User user) {
        user.setId(System.nanoTime());
        String rawPassword = user.getPassword();
        user.setPassword(passwordEncoder.encode(rawPassword)); // hashing
        UserEntity userEntity = userEntityRepository.save(user.toEntity());
        return new User().fromEntity(userEntity);
    }

    @Override
    public String authenticate(User user) {

        UserEntity entity = userEntityRepository.findByEmail(user.getEmail());
        if(entity == null){
            throw new AppRuntimeException("login failed");
        }
        String encodedPassword = entity.getPassword();
        boolean passwordMatched = passwordEncoder.matches(user.getPassword(), encodedPassword);

        if(passwordMatched){
            user = new User().fromEntity(entity);
            return authService.createAuthenticationContext(user);
        }
        throw new AppRuntimeException("login failed");
    }
}
