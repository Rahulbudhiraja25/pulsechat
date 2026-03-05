package com.pulsechat.pulseSer.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {
    @Email(message = "Please enter a valid email id")
    @NotBlank(message = "Email id cannot be blank")
    private String email;
    @NotBlank(message = "Password cannot be blank")
    private String password;
}