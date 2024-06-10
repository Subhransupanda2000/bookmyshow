package com.example.bookmyshow.controller;
import com.example.bookmyshow.model.Address;
import com.example.bookmyshow.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/address")
    public class AddressController {
        @Autowired
        private AddressService addressService;

        @PostMapping
        public Address createAddress(@RequestBody Address address) {
            return addressService.createAddress(address);

        }

    }


