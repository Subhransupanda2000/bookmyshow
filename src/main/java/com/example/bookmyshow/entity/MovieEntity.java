package com.example.bookmyshow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "movie")
public class MovieEntity {
    @Id
    private Long id;
    private String name;
}
