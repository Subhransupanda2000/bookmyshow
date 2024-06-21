package com.example.bookmyshow.model;

import com.example.bookmyshow.entity.BookingsEntity;
import lombok.Data;

import java.util.Date;

@Data
public class Bookings {
    private Long id;
    private Long userId;
    private Long showId;
    private Date bookingsDate;

    public BookingsEntity toEntity() {
        BookingsEntity entity = new BookingsEntity();
        entity.setId(this.getId());
        entity.setUserId(this.getUserId());
        entity.setBookingsDate(this.getBookingsDate());
        entity.setShowId(this.getShowId());
        return entity;
    }

    public Bookings fromEntity(BookingsEntity entity) {
        this.setId(entity.getId());
        this.setShowId(entity.getShowId());
        this.setBookingsDate(entity.getBookingsDate());
        this.setUserId(entity.getUserId());
        return this;
    }
}