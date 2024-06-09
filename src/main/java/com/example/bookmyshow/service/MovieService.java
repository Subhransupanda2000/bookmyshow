package com.example.bookmyshow.service;

import com.example.bookmyshow.model.Movie;
import org.springframework.stereotype.Service;

@Service
public interface MovieService {

    public Movie createMovie(Movie movie) ;

}
