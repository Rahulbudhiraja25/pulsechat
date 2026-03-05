package com.pulsechat.pulseSer.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Username is required")
    @Column(nullable = false, unique = true)
    private String username;
    @NotBlank(message = "Password cannot be empty")
    @Column(nullable = false)
    private String password;
    @Email(message = "Please provide a valid email")
    @NotBlank(message = "Email id is required")
    @Column(unique = true,nullable = false)
    private String email;
    private boolean online=false;
    @Column
    private LocalDateTime lastSeen;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;
}
