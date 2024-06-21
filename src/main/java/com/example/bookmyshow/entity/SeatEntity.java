package com.example.bookmyshow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "seat")
@Data
public class SeatEntity {
    @Id
    private Long id;
    private Long screenId;
    private Long seatNumber;
}

