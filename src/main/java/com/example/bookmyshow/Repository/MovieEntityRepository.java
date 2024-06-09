package com.example.bookmyshow.Repository;

import com.example.bookmyshow.entity.MovieEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieEntityRepository extends CrudRepository<MovieEntity, Long> {

}
