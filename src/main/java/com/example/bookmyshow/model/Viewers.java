package com.example.bookmyshow.model;

import com.example.bookmyshow.entity.ViewersEntity;
import lombok.Data;

@Data
public class Viewers {
    private Long id;
    private Long userId;
    private Long showId;
    private Long seatId;

    public ViewersEntity toEntity() {
        ViewersEntity entity = new ViewersEntity();
        entity.setId(this.getId());
        entity.setShowId(this.getShowId());
        entity.setUserId(this.getUserId());
        entity.setSeatId(this.getSeatId());
        return entity;
    }

    public Viewers fromEntity(ViewersEntity entity) {
        this.setId(entity.getId());
        this.setSeatId(entity.getSeatId());
        this.setShowId(entity.getShowId());
        this.setUserId(entity.getUserId());
        return this;
    }
}
