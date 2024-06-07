package com.example.bookmyshow.controller;

import com.example.bookmyshow.auth.Token;
import com.example.bookmyshow.model.User;
import com.example.bookmyshow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/signup")
    public User createUser(@RequestBody User user)
    {
        user.setId(System.nanoTime());
        return userService.createUser(user);
    }
    @PostMapping("/login")
    public Token authenticate(@RequestBody User user)
    {
        String tokenValue = userService.authenticate(user);
        Token token = new Token();
        token.setEncodedTokenValue(tokenValue);
        return token;
    }
}
