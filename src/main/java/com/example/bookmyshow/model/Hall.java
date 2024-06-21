package com.example.bookmyshow.model;


import com.example.bookmyshow.entity.HallEntity;
import lombok.Data;

@Data
public class Hall {
    private Long id;
    private String hallType;
    private String name;

    public HallEntity toEntity() {
        HallEntity entity = new HallEntity();
        entity.setId(this.getId());
        entity.setHallType(this.getHallType());
        entity.setName(this.getName());
        return entity;
    }

    public Hall fromEntity(HallEntity entity) {
        this.setId(entity.getId());
        this.setHallType(entity.getHallType());
        this.setName(entity.getName());
        return this;
    }
}