package com.example.bookmyshow.service;

import com.example.bookmyshow.model.Address;
import org.springframework.stereotype.Service;

@Service
public interface AddressService {
    Address createAddress(Address address);
}
