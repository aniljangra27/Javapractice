package com.spring345.springbootapplication.repository;

import com.spring345.springbootapplication.Entity.ArticleEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoDBRepository extends MongoRepository<ArticleEntry, String> {
    // Custom query methods can be defined here if needed
    // For example, findByTitle(String title);
}
