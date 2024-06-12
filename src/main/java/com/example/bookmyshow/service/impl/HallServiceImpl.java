package com.example.bookmyshow.service.impl;

import com.example.bookmyshow.Repository.HallEntityRepository;
import com.example.bookmyshow.entity.HallEntity;
import com.example.bookmyshow.model.Hall;
import com.example.bookmyshow.service.HallService;
import com.example.bookmyshow.utills.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HallServiceImpl implements HallService {
    @Autowired
    private HallEntityRepository hallEntityRepository;

    @Override
    public Hall createHall(Hall hall) {
        hall.setId(IdGenerator.getLongId());
        HallEntity entity = hall.toEntity();
        entity = hallEntityRepository.save(entity);
        return hall.fromEntity(entity);
    }
}
