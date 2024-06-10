package com.example.bookmyshow.entity;

import com.example.bookmyshow.model.Address;
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
    private Address address;
}
