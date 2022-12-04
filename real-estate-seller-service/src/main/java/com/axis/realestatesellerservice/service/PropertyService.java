package com.axis.realestatesellerservice.service;

import java.util.List;

import com.axis.realestatesellerservice.entity.Property;

public interface PropertyService {
	// get all property
	List<Property> getAllProperty();
	
	// get property by id
	Property getPropertyById(int propertyId);
	
	// add property
	void addProperty(Property property);
	
	// update property
	void updateProperty(int propertyId, Property updatedProperty);
	
	// delete property
	void deleteProperty(int propertyId);
}
