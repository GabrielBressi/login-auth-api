package com.gabriel.loginauthapi.dto;

public record RegisterRequestDTO(
    String name, 
    String email,
    String password
) {
    
}
