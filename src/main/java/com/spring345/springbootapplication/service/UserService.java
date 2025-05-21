package com.spring345.springbootapplication.service;

import com.spring345.springbootapplication.Entity.UserEntity;
import com.spring345.springbootapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public void saveUserEntry(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public ResponseEntity<UserEntity> getUserById(String id) {
        Optional<UserEntity> articleEntryOptional = userRepository.findById(id);
        return articleEntryOptional.map(articleEntry -> new ResponseEntity<>(articleEntry, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    public void deleteUserById(String id) {
        Optional<UserEntity> byId = userRepository.findById(id);
        if(byId.isEmpty()) {
            System.out.println("User not found");
        }
        userRepository.deleteById(id);
    }

    public ResponseEntity<String> findByUsername(UserEntity userEntity, String userName) {
        UserEntity userNameInDB = userRepository.findByUserName(userName);
        if (userNameInDB != null) {
            userNameInDB.setUserName(userEntity.getUserName());
            userNameInDB.setPassword(userEntity.getPassword());
            saveUserEntry(userNameInDB);
        }
        return ResponseEntity.ok("User updated successfully");

    }

    public UserEntity findByUserNameOnly(String userName) {
        return userRepository.findByUserName(userName);
    }
}
