package com.spring345.springbootapplication.repository;

import com.spring345.springbootapplication.Entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity, String> {
    // Custom query methods can be defined here if needed
    // findByUsername(String username);
    UserEntity findByUserName(String userName);
}
