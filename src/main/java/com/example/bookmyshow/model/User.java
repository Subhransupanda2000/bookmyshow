package com.example.bookmyshow.model;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String email;
    private char[] password;
    private String firstName;
    private String lastName;
    private UserRole role;
}
