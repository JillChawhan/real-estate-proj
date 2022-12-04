package com.axis.realestatesellerservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axis.realestatesellerservice.entity.SellerDetails;

@Repository
public interface SellerDetailsRepository extends CrudRepository<SellerDetails, Long>{

}
