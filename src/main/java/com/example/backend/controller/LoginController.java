package com.example.backend.controller;

import com.example.backend.DTO.LoginRequest;
import com.example.backend.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/backend/api/auth")
@CrossOrigin(origins = "http://localhost:8080")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/signin")
    public Boolean userc( @RequestBody LoginRequest loginRequest ) {
        return loginService.check(loginRequest);
    }
}



//    @PostMapping(value = "/signin3")   로그인 예제
//    public ResponseEntity<String> login( @RequestBody LoginRequest loginRequest ) {
//        return ResponseEntity.ok(loginRequest.getId());
////        User user = userRepository.findByUsername(loginRequest.getId());
////
////        if (user != null && user.getPassword().equals(loginRequest.getPassword())) {
////            return ResponseEntity.ok("good");
////        } else {
////            return ResponseEntity.status(401).body("Invalid username or password");
////        }
//
//    }