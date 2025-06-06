package com.spring345.springbootapplication.controller;

import com.spring345.springbootapplication.Entity.UserEntity;
import com.spring345.springbootapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {
    @Autowired
    UserService userService;
    @PostMapping
    public void addNewUserWithencyptPwd(@RequestBody UserEntity userEntity) {
        userService.saveNewsUser(userEntity);
    }

    @PostMapping ("/health-check")
    public String healthCheck() {
        return "Public Controller is up and running!";
    }
}
