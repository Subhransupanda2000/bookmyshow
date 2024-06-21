package com.example.bookmyshow.Repository;

import com.example.bookmyshow.entity.HallEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallEntityRepository extends CrudRepository<HallEntity,Long> {
}
