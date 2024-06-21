package com.example.bookmyshow.model;
import com.example.bookmyshow.entity.AddressEntity;
import lombok.Data;

@Data
public class Address {

    private Long id;
    private Long userId;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private Long hallId;


    public AddressEntity toEntity(){
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setId(this.getId());
        addressEntity.setUserId(this.getUserId());
        addressEntity.setLine1(this.getLine1());
        addressEntity.setLine2(this.getLine2());
        addressEntity.setCity(this.getCity());
        addressEntity.setState(this.getState());
        addressEntity.setCountry(this.getCountry());
        addressEntity.setPostalCode(this.getPostalCode());
        addressEntity.setHallId(this.getHallId());
        return addressEntity;
    }

    public Address fromEntity(AddressEntity entity){
        this.setId(entity.getId());
        this.setUserId(entity.getUserId());
        this.setLine1(entity.getLine1());
        this.setLine2(entity.getLine2());
        this.setCity(entity.getCity());
        this.setState(entity.getState());
        this.setCountry(entity.getCountry());
        this.setPostalCode(entity.getPostalCode());
        this.setHallId(entity.getHallId());
        return this;
    }

}
