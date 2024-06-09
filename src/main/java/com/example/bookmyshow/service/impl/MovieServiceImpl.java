package com.example.bookmyshow.service.impl;

import com.example.bookmyshow.Repository.MovieEntityRepository;
import com.example.bookmyshow.entity.MovieEntity;
import com.example.bookmyshow.model.Movie;
import com.example.bookmyshow.service.MovieService;
import com.example.bookmyshow.utills.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieEntityRepository movieEntityRepository;

    @Override
    public Movie createMovie(Movie movie) {
        movie.setId(IdGenerator.getLongId());

        MovieEntity entity = movieEntityRepository.save(movie.toEntity());
        return new Movie().fromEntity(entity);

    }
}
