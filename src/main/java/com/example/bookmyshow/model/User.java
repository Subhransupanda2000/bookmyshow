package com.example.bookmyshow.model;

import com.example.bookmyshow.entity.UserEntity;
import lombok.Data;

@Data
public class User {
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private UserRole role;

    public UserEntity toEntity() {
        UserEntity entity = new UserEntity();
        entity.setId(this.getId());
        entity.setEmail(this.getEmail());
        entity.setFirstName(this.getFirstName());
        entity.setRole(this.getRole().name());
        entity.setLastName(this.getLastName());
        entity.setPassword(this.getPassword());

        return entity;
    }

    public User fromEntity(UserEntity entity) {
        this.setId(entity.getId());
        this.setEmail(entity.getEmail());
        this.setPassword("[PROTECTED]");
        this.setFirstName(entity.getFirstName());
        this.setLastName(entity.getLastName());
        this.setRole(UserRole.valueOf(entity.getRole().toUpperCase()));
        return this;
    }
}
