package com.example.bookmyshow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "showSeat")
public class ShowSeatEntity {
    @Id
    private Long showId;
    private Long seatId;
}
