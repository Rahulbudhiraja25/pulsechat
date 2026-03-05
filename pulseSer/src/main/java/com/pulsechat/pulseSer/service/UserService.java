package com.pulsechat.pulseSer.service;

import com.pulsechat.pulseSer.dto.LoginRequest;
import com.pulsechat.pulseSer.dto.LoginResponse;
import com.pulsechat.pulseSer.model.User;
import com.pulsechat.pulseSer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(PasswordEncoder passwordEncoder,UserRepository userRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    public String registerUser(User user) {

        if(userRepository.existsByUsername(user.getUsername())){
            throw new RuntimeException("Username already exists");
        }

        if(userRepository.existsByEmail(user.getEmail())){
            throw new RuntimeException("Email already exists");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);

        return user.getUsername() + " successfully registered";
    }

    public LoginResponse login(LoginRequest loginRequest) {

        User user = userRepository.findByEmail(loginRequest.getEmail())
                .orElseThrow(() -> new RuntimeException("Invalid email or password"));

        boolean isLoggedIn = passwordEncoder.matches(
                loginRequest.getPassword(),
                user.getPassword()
        );

        if (!isLoggedIn) {
            throw new RuntimeException("Invalid email or password");
        }

        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setToken("testtoken"); // replace with JWT later
        loginResponse.setUsername(user.getUsername());
        loginResponse.setEmail(user.getEmail());
        loginResponse.setId(user.getId());
        return loginResponse;
    }
}
