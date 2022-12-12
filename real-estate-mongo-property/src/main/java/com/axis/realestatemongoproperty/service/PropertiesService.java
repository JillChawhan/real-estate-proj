package com.axis.realestatemongoproperty.service;

import java.util.List;

import com.axis.realestatemongoproperty.entity.Properties;

public interface PropertiesService {
	
	List<Properties> getAllProperties();
	
	Properties getPropertyById(String propertyId);

    void addProperty(Properties property);

    void deletePropertyById(String propertyId);

    void updatePropertybyId(String propertyId, Properties updatedProperty);
}
