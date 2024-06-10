package com.example.bookmyshow.Repository;

import com.example.bookmyshow.entity.AddressEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressEntityRepository extends CrudRepository<AddressEntity,Long> {
}
