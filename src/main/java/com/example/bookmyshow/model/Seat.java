package com.example.bookmyshow.model;

import com.example.bookmyshow.entity.SeatEntity;
import lombok.Data;

@Data
public class Seat {
    private Long id;
    private Long screenId;
    private Long seatNumber;

    public SeatEntity toEntity() {
        SeatEntity entity = new SeatEntity();
        entity.setId(this.getId());
        entity.setSeatNumber(this.getSeatNumber());
        entity.setScreenId(this.getScreenId());
        return entity;
    }

    public Seat fromEntity(SeatEntity entity) {
        this.setId(entity.getId());
        this.setSeatNumber(entity.getSeatNumber());
        this.setScreenId(entity.getScreenId());
        return this;
    }
}
