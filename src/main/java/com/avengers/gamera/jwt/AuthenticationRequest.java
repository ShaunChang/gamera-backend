package com.avengers.gamera.jwt;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String email;
    private String password;
}