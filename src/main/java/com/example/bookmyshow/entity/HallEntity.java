package com.example.bookmyshow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "hall")
public class HallEntity {
    @Id
    private Long id;
    private String hallType;
    private int screenNumber;
    private int seatNumber;
    private Long addressId;
}
