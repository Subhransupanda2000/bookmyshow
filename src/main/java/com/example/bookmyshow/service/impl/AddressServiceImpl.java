package com.example.bookmyshow.service.impl;

import com.example.bookmyshow.Repository.AddressEntityRepository;
import com.example.bookmyshow.entity.AddressEntity;
import com.example.bookmyshow.model.Address;
import com.example.bookmyshow.service.AddressService;
import com.example.bookmyshow.service.UserContextService;
import com.example.bookmyshow.utills.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressEntityRepository addressEntityRepository;
    @Autowired
    private UserContextService userContextService;
    @Override
    public Address createAddress(Address address) {
        address.setId(IdGenerator.getLongId());
        address.setUserId(userContextService.getUserId());
        AddressEntity entity = address.toEntity();
        entity = addressEntityRepository.save(entity);
        return address.fromEntity(entity);
    }
}
