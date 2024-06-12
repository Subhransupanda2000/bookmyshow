package com.example.bookmyshow.config;

import com.example.bookmyshow.auth.AuthService;
import com.example.bookmyshow.filters.AuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {

    @Bean
    public FilterRegistrationBean<AuthenticationFilter> authenticationFilter(@Autowired AuthService authService) {
        FilterRegistrationBean<AuthenticationFilter> registrationBean
                = new FilterRegistrationBean<>();

        registrationBean.setFilter(new AuthenticationFilter(authService));
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(2);

        return registrationBean;
    }
}
