package com.spring345.springbootapplication.service;

import com.spring345.springbootapplication.Entity.ArticleEntry;
import com.spring345.springbootapplication.repository.MongoDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ArticleEntryService {
    @Autowired
    MongoDBRepository mongoDBRepository;

    public void saveArticleEntry(ArticleEntry articleEntry) {
        mongoDBRepository.save(articleEntry);
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


}
