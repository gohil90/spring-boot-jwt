package com.security.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.security.jwt")
public class SpringBootJWTApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJWTApplication.class, args);
    }

}
