package com.example.bookmyshow.auth;


import com.example.bookmyshow.model.User;

public interface AuthService {
        public String createAuthenticationContext(User user);
        public boolean destroyAuthenticationContext(String tokenStr);
        public void setUserContext(String tokenStr);
    }


