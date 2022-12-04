package com.axis.realestatebuyerservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axis.realestatebuyerservice.entity.SellerDetails;

@Repository
public interface SellerDetailsRepository extends CrudRepository<SellerDetails, Long>{

}
