package com.maramiulescu.watchlistbackend.data;

import org.springframework.data.annotation.Id;

// This class represents a single watchlist item
// such as a movie or series to be watched

public class ToWatch {

    @Id
    private String id;

    private String title;

    private Boolean watched;

    private Boolean liked;

    public ToWatch(String title, Boolean watched, Boolean liked) {
        this.title = title;
        this.watched = watched;
        this.liked = liked;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getWatched() {
        return watched;
    }

    public Boolean getLiked() {
        return liked;
    }
}
