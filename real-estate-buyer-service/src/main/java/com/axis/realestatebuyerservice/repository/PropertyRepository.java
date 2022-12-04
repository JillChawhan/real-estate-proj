package com.axis.realestatebuyerservice.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axis.realestatebuyerservice.entity.Property;

@Repository
public interface PropertyRepository extends CrudRepository<Property, Integer>{
	@Modifying
	@Query("UPDATE Property SET status=?1,daysOnMarket=?2,type=?3,yearBuilt=?4,bathroom=?5,bed=?6,livingRoom=?7,price=?8,squareFeet=?9,plotNumber=?10,streetName=?11,city=?12,state=?13,country=?14,pinCode=?15 WHERE propertyId=16")
	public void updatePropertyInfo(String status,int daysOnMarket,String type,
	int yearBuilt,int bathroom,int bed,int livingRoom,long price,double squareFeet,
	String plotNumber,String streetName,String city,String state,String country,
	int pinCode,int propertyId);
}
