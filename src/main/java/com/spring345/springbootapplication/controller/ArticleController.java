package com.spring345.springbootapplication.controller;

import com.spring345.springbootapplication.Entity.ArticleEntry;
import com.spring345.springbootapplication.Entity.UserEntity;
import com.spring345.springbootapplication.service.ArticleEntryService;
import com.spring345.springbootapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/article")
public class ArticleController {
    @Autowired
    private ArticleEntryService articleEntryService;
    @Autowired
    private UserService userService;
    // Example method to get all articles
     @GetMapping("/entries")
     public List<ArticleEntry> getAllArticles() {
         return articleEntryService.getAllArticles();
     }

    /**
     * Map this with the UserEntity class
     * @param userName
     * @return
     */
     @GetMapping("{userName}")
    public ResponseEntity<?> getAllArticlesEntriesOfUser(@PathVariable String userName) {
         UserEntity user = userService.findByUserNameOnly(userName);
         List<ArticleEntry> allArticles = user.getArticles(); // Get entry from UserEntity
         if(allArticles != null && !allArticles.isEmpty()) {
             return new ResponseEntity<>(allArticles, HttpStatus.OK);
         }
         return new ResponseEntity<>(Collections.emptyList(), HttpStatus.NOT_FOUND);
     }

    @PostMapping("/add/{userName}")
    public void createArticleEntry(@RequestBody ArticleEntry articleEntry, @PathVariable String userName) {
         articleEntryService.saveArticleEntry(articleEntry, userName);
    }

    // Example method to create a new article
     @PostMapping("/add")
     public void createArticle(@RequestBody ArticleEntry articleEntry) {
         articleEntryService.saveArticleEntry(articleEntry);
     }

    // Example method to get an article by ID - with HTTP status code
    @GetMapping("/entries/{id}")
    public ResponseEntity<ArticleEntry> getArticleById(@PathVariable String id) {
        return articleEntryService.getArticleById(id);
    }
    // Example method to delete an article by ID
    @DeleteMapping("/delete/{id}")
    public void deleteArticleById(@PathVariable String id) {
        articleEntryService.deleteArticleById(id);
    }

    @DeleteMapping("/del/{id}/user/{userName}")
    public void deleteArticleById(@PathVariable String id, @PathVariable String userName) {
        articleEntryService.deleteArticleByIdWithUser(id, userName);
    }
    // Example method to update an article by ID
    @PutMapping("/update/{id}")
    public void updateArticle(@PathVariable String id, @RequestBody ArticleEntry articleEntry) {
        articleEntry.setId(id);
        articleEntryService.saveArticleEntry(articleEntry);
    }

}
