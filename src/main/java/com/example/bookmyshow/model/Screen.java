package com.example.bookmyshow.model;

import com.example.bookmyshow.entity.ScreenEntity;
import lombok.Data;

@Data
public class Screen {
    private Long id;
    private Long hallId;
    private String name;

    public ScreenEntity toEntity() {
        ScreenEntity entity = new ScreenEntity();
        entity.setId(this.getId());
        entity.setName(this.getName());
        entity.setHallId(this.getHallId());

        return entity;
    }

    public Screen fromEntity(ScreenEntity entity) {
        this.setId(entity.getId());
        this.setName(entity.getName());
        this.setHallId(entity.getHallId());
        return this;
    }
}
