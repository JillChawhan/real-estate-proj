package com.axis.realestatedemo.service;

import java.util.List;

import com.axis.realestatedemo.entity.Property;

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
