package com.example.bookmyshow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "screen")
public class ScreenEntity {
    @Id
    private Long id;
    private Long hallId;
    private String name;
}
