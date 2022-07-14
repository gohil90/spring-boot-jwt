package com.security.jwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/user")
    public ResponseEntity<?> testAPIWithAuthentication() {
        return ResponseEntity.ok("Authenticated!");
    }

    @GetMapping("/admin")
    public ResponseEntity<?> testAPIWithAuthorization() {
        return ResponseEntity.ok("Authorization as admin!");
    }
}
