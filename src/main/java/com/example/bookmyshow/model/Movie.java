package com.example.bookmyshow.model;

import com.example.bookmyshow.entity.MovieEntity;
import lombok.Data;

@Data
public class Movie {
    private Long id;
    private String name;

    public MovieEntity toEntity() {
        MovieEntity entity = new MovieEntity();
        entity.setId(this.getId());
        entity.setName(this.getName());

        return entity;
    }

    public Movie fromEntity(MovieEntity entity) {
        this.setId(entity.getId());
        this.setName(entity.getName());
        return this;
    }
}
