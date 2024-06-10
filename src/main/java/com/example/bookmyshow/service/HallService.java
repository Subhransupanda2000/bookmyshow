package com.example.bookmyshow.service;

import com.example.bookmyshow.model.Hall;
import org.springframework.stereotype.Service;

@Service
public interface HallService {

    Hall createHall(Hall hall);
}
