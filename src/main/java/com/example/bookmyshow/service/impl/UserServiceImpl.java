package com.example.bookmyshow.service.impl;

import com.example.bookmyshow.Repository.UserEntityRepository;
import com.example.bookmyshow.model.User;
import com.example.bookmyshow.entity.UserEntity;
import com.example.bookmyshow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
@Autowired
private UserEntityRepository userEntityRepository;


    @Override
    public User createUser(User user) {
        UserEntity userEntity = userEntityRepository.save(user.toEntity());
        return new User().fromEntity(userEntity);
    }
}
