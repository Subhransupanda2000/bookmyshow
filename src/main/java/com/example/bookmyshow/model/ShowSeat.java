package com.example.bookmyshow.model;

import com.example.bookmyshow.entity.ShowSeatEntity;
import lombok.Data;

@Data
public class ShowSeat {
    private Long showId;
    private Long seatId;

    public ShowSeatEntity toEntity() {
        ShowSeatEntity entity = new ShowSeatEntity();
        entity.setSeatId(this.getSeatId());
        entity.setShowId(this.getShowId());
        return entity;
    }

    public ShowSeat fromEntity(ShowSeatEntity entity) {
        this.setSeatId(entity.getSeatId());
        this.setShowId(entity.getShowId());
        return this;
    }
}