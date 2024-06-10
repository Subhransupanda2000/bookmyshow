package com.example.bookmyshow.service.impl;

import com.example.bookmyshow.Repository.HallEntityRepository;
import com.example.bookmyshow.entity.HallEntity;
import com.example.bookmyshow.model.Hall;
import com.example.bookmyshow.service.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HallServiceImpl implements HallService {
    @Autowired
    private HallEntityRepository hallEntityRepository;

    @Override
    public Hall createHall(Hall hall) {
        HallEntity entity = hallEntityRepository.save(hall.toEntity());
        return new Hall().fromEntity(entity);
    }
}
