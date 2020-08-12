package com.maramiulescu.watchlistbackend.service;

import com.maramiulescu.watchlistbackend.data.ToWatch;
import com.maramiulescu.watchlistbackend.exception.EntityNotFoundException;
import com.maramiulescu.watchlistbackend.repository.ToWatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// This class handles all database communication needed
// for adding, updating, and deleting watchlist items

@Service
public class ToWatchService {

    @Autowired
    private ToWatchRepository toWatchRepository;

    public List<ToWatch> findAll() {
        return toWatchRepository.findAll();
    }

    public ToWatch findById(String id) {
        return toWatchRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public ToWatch save(ToWatch toWatch) {
        return toWatchRepository.save(toWatch);
    }

    public void deleteById(String id) {
        toWatchRepository.deleteById(id);
    }
}
