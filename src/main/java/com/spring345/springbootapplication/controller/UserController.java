package com.spring345.springbootapplication.controller;

import com.spring345.springbootapplication.Entity.UserEntity;
import com.spring345.springbootapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/all")
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }
    @PostMapping("/add")
    public void addUser(@RequestBody UserEntity userEntity) {
        userService.saveUserEntry(userEntity);
    }

    //add logic for PUT and DELETE
    @PutMapping("/put/{userName}")
    public ResponseEntity<String> updateUser(@RequestBody UserEntity userEntity, @PathVariable String userName) {
        return userService.findByUsername(userEntity, userName);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUserById(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserEntity> getArticleById(@PathVariable String id) {
        return userService.getUserById(id);
    }
}
