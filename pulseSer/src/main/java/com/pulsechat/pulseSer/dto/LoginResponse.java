package com.pulsechat.pulseSer.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LoginResponse {

    private String token;
    private Long id;
    private String username;
    private String email;
}