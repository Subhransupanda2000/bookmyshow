package com.example.bookmyshow.model;


import com.example.bookmyshow.entity.HallEntity;
import lombok.Data;

@Data
public class Hall {
    private Long id;
    private String hallType;
    private int screenNumber;
    private int seatNumber;
    private Address address;

    public HallEntity toEntity() {
        HallEntity entity = new HallEntity();
        entity.setId(this.getId());
        entity.setHallType(this.getHallType());
        entity.setScreenNumber(this.getScreenNumber());
        entity.setSeatNumber(this.getSeatNumber());
        entity.setAddress(this.getAddress());
        return entity;
    }

    public Hall fromEntity(HallEntity entity) {
        this.setId(entity.getId());
        this.setScreenNumber(entity.getScreenNumber());
        this.setHallType(entity.getHallType());
        this.setSeatNumber(entity.getSeatNumber());
        this.setAddress(entity.getAddress());
        return this;
    }
}
