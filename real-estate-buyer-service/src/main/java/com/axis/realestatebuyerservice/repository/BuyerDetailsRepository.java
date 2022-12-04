package com.axis.realestatebuyerservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axis.realestatebuyerservice.entity.BuyerDetails;

@Repository
public interface BuyerDetailsRepository extends CrudRepository<BuyerDetails, Long>{

}
