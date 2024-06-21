package com.example.bookmyshow.controller;

import com.example.bookmyshow.model.Movie;
import com.example.bookmyshow.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @PostMapping
    public Movie createMovie(@RequestBody Movie movie)
    {
        return movieService.createMovie(movie);
    }
}
