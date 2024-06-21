package com.example.bookmyshow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;
@Data
@Entity
@Table(name = "show")
public class ShowEntity {
    @Id
    private Long id;
    private Date date;
    private Time time;
    private Long hallId;
    private Long movieId;
    private Long screenId;
}
