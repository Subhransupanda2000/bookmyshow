package com.example.bookmyshow.auth;
import com.example.bookmyshow.model.User;
import lombok.Data;
@Data
public class AuthenticationContext {
    private String userId;
    private String headerTokenUUID;
    private Long expiryAt;
    private User user;
}

