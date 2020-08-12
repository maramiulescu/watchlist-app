package com.maramiulescu.watchlistbackend.repository;

import com.maramiulescu.watchlistbackend.data.ToWatch;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToWatchRepository extends MongoRepository<ToWatch, String> {
}
