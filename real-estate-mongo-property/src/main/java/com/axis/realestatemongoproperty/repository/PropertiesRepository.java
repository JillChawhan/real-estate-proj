package com.axis.realestatemongoproperty.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.axis.realestatemongoproperty.entity.Properties;

@Repository
public interface PropertiesRepository extends MongoRepository<Properties, String> {

}
