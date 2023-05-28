package com.example.backend.controller;

import com.example.backend.DTO.LoginRequest;
import com.example.backend.DTO.testDTO;
import com.example.backend.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rest/api")
@CrossOrigin(origins = "http://localhost:8080")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public Boolean userc( @RequestBody LoginRequest loginRequest ) {
        System.out.println(loginRequest.getId() + loginRequest.getPassword());
        return loginService.check(loginRequest);
    }

    @GetMapping("/home")
    public String Home() {
        System.out.println("req come");
        return ("title" + "name" + "sda" + "dsadsa" + "img");
    }

    @PostMapping("/view")
    public testDTO Postf(@RequestBody testDTO postNum) {
        System.out.println(postNum.getPostNum());
        return postNum;
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