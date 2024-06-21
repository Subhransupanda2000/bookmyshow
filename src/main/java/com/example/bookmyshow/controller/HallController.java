package com.example.bookmyshow.controller;

import com.example.bookmyshow.model.Hall;
import com.example.bookmyshow.service.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/halls")
public class HallController {
    @Autowired
    private HallService hallService;

    @PostMapping
    public Hall createHall(@RequestBody Hall hall) {
        return hallService.createHall(hall);

    }

}
