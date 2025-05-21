package com.spring345.springbootapplication.controller;

import com.spring345.springbootapplication.Entity.JournalEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/journal")
public class JournalController {
    private Map<Long, JournalEntity> journalMap = new HashMap<>();

    // Get all journals
    @GetMapping("/entries")
    public List<JournalEntity> getAll() {
        return new ArrayList<>(journalMap.values());
    }
    // Get a journal by ID
    @GetMapping("/entries/{id}")
    public JournalEntity getJournalById(@PathVariable Long id) {
        return journalMap.get(id);
    }
    // Create a new journal entry
   @PostMapping("/add")
   public boolean createEntry(@RequestBody JournalEntity journalEntity) {
        journalMap.put(journalEntity.getId(), journalEntity);
        return true;
   }
   @PutMapping("/update/{id}")
    public boolean updateEntry(@PathVariable Long id, @RequestBody JournalEntity journalEntity) {
          if (journalMap.containsKey(id)) {
                journalMap.put(id, journalEntity);
                return true;
          } else {
              journalMap.put(journalEntity.getId(), journalEntity);
          }
          return false;
    }

}
