package com.spring345.springbootapplication.service;

import com.spring345.springbootapplication.Entity.ArticleEntry;
import com.spring345.springbootapplication.Entity.UserEntity;
import com.spring345.springbootapplication.repository.MongoDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class ArticleEntryService {
    @Autowired
    MongoDBRepository mongoDBRepository;

    @Autowired
    UserService userService;

    public void saveArticleEntry(ArticleEntry articleEntry) {
        mongoDBRepository.save(articleEntry);
    }

    public void saveArticleEntry(ArticleEntry articleEntry, String userName) {
        UserEntity user = userService.findByUserNameOnly(userName);
        ArticleEntry articleEntry1 = mongoDBRepository.save(articleEntry);
        user.getArticles().add(articleEntry1);
        userService.saveUserEntry(user);
    }

    public List<ArticleEntry> getAllArticles() {
        return mongoDBRepository.findAll();
    }

    public ResponseEntity<ArticleEntry> getArticleById(String id) {
        Optional<ArticleEntry> articleEntryOptional = mongoDBRepository.findById(id);
        return articleEntryOptional.map(articleEntry -> new ResponseEntity<>(articleEntry, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    public void deleteArticleById(String id) {
        mongoDBRepository.deleteById(id);
    }

    // Method to delete an article by ID with user reference as well
    public void deleteArticleByIdWithUser(String id, String userName) {
        UserEntity user = userService.findByUserNameOnly(userName);
        user.getArticles().removeIf(articleEntry -> articleEntry.getId().equals(id));
        userService.saveUserEntry(user);
        mongoDBRepository.deleteById(id);
    }
}
