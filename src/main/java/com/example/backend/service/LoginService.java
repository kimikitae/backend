package com.example.backend.service;


import com.example.backend.DTO.LoginRequest;
import com.example.backend.Repository.UserRepository;
import com.example.backend.document.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
public class LoginService {
    @Autowired
    private UserRepository userRepository;


    public Boolean check(LoginRequest dto){
        User user = userRepository.findByUserId(dto.getId());

        System.out.println(user);

        //System.out.println("디비야 잘 가져 왔니?:" + user.getUid() + "    " + user.getId() + "    " + user.getPw());

        return user != null && user.getPassword().equals(dto.getPassword());
    }
}