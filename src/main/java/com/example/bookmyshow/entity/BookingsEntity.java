package com.example.bookmyshow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "bookings")
public class BookingsEntity {
    @Id
    private Long id;
    private Long userId;
    private Long showId;
    private Date bookingsDate;
}
