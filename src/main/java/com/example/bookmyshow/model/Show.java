package com.example.bookmyshow.model;

import com.example.bookmyshow.entity.ShowEntity;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class Show {
    private Long id;
    private Date date;
    private Time time;
    private Long hallId;
    private Long movieId;
    private Long screenId;

    public ShowEntity toEntity() {
        ShowEntity entity = new ShowEntity();
        entity.setId(this.getId());
        entity.setDate(this.getDate());
        entity.setTime(this.getTime());
        entity.setHallId(this.getHallId());
        entity.setMovieId(this.getMovieId());
        entity.setScreenId(this.getScreenId());

        return entity;
    }

    public Show fromEntity(ShowEntity entity) {
        this.setId(entity.getId());
        this.setDate(entity.getDate());
        this.setTime(entity.getTime());
        this.setHallId(entity.getHallId());
        this.setScreenId(entity.getScreenId());
        this.setMovieId(entity.getMovieId());
        return this;
    }
}
