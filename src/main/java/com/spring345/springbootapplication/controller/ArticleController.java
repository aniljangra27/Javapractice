package com.spring345.springbootapplication.controller;

import com.spring345.springbootapplication.Entity.ArticleEntry;
import com.spring345.springbootapplication.service.ArticleEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/article")
public class ArticleController {
    @Autowired
    private ArticleEntryService articleEntryService;
    // Example method to get all articles
     @GetMapping("/entries")
     public List<ArticleEntry> getAllArticles() {
         return articleEntryService.getAllArticles();
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
    // Example method to update an article by ID
    @PutMapping("/update/{id}")
    public void updateArticle(@PathVariable String id, @RequestBody ArticleEntry articleEntry) {
        articleEntry.setId(id);
        articleEntryService.saveArticleEntry(articleEntry);
    }

}
