package com.security.jwt.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class LoginResponse {
    private String token;
    private Long id;
    private String username;
    private List<String> roles;

}
