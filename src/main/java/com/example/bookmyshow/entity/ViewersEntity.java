package com.example.bookmyshow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "viewers")
public class ViewersEntity {
    @Id
    private Long id;
    private Long userId;
    private Long showId;
    private Long seatId;
}
