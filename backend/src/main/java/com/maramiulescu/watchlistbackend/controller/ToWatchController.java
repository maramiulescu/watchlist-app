package com.maramiulescu.watchlistbackend.controller;

import com.maramiulescu.watchlistbackend.data.ToWatch;
import com.maramiulescu.watchlistbackend.service.ToWatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// This class handles all requests needed for
// creating, updating, and deleting watchlist items

@RestController
@RequestMapping("/api/towatch") // Map all endpoints to /api/towatch
public class ToWatchController {

    @Autowired
    private ToWatchService toWatchService;

    @GetMapping
    public List<ToWatch> findAll() {
        return toWatchService.findAll();
    }

    @GetMapping("/{id}")
    public ToWatch findById(@PathVariable String id) {
        return toWatchService.findById(id);
    }

    @PostMapping
    public ToWatch create(@RequestBody ToWatch toWatch) {
        return toWatchService.save(toWatch);
    }

    @PutMapping("/{id}")
    public ToWatch update(@RequestBody ToWatch toWatch) {
        return toWatchService.save(toWatch);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        toWatchService.deleteById(id);
    }
}
