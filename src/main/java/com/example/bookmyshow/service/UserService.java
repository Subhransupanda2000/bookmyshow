package com.example.bookmyshow.service;

import com.example.bookmyshow.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

     User createUser(User user) ;
     String authenticate (User user) ;

}
