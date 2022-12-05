package com.axis.realestatereviewservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axis.realestatereviewservice.entity.Review;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long>{

}
