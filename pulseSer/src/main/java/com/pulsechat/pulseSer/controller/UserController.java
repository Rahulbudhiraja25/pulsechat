package com.pulsechat.pulseSer.controller;

import com.pulsechat.pulseSer.dto.LoginRequest;
import com.pulsechat.pulseSer.dto.LoginResponse;
import com.pulsechat.pulseSer.model.User;
import com.pulsechat.pulseSer.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/auth/register")
    public ResponseEntity<String> register(@Valid @RequestBody User user){
        String response = userService.registerUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @GetMapping("/privateTest")
    public ResponseEntity<String> privateTest(){
        return ResponseEntity.status(HttpStatus.OK).body("Authentication is working fine");
    }
    @PostMapping("/auth/login")
    public ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginRequest loginRequest){
        LoginResponse res=userService.login(loginRequest);
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }
}
