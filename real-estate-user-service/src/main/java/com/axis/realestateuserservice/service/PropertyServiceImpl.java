package com.axis.realestateuserservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.realestateuserservice.entity.Property;
import com.axis.realestateuserservice.repository.PropertyRepository;

import javax.transaction.Transactional;

@Service
public class PropertyServiceImpl implements PropertyService {

	@Autowired
	PropertyRepository propertyRepository;
	
	@Override
	public List<Property> getAllProperty() {
		return (List<Property>) propertyRepository.findAll();
	}

	@Override
	public Property getPropertyById(int propertyId) {
		return propertyRepository.findById(propertyId).get();
	}

	@Override
	public void addProperty(Property property) {
		propertyRepository.save(property);
	}
	
	@Transactional
	@Override
	public void updateProperty(int propertyId, Property updatedProperty) {
		propertyRepository.updatePropertyInfo(updatedProperty.getStatus(),
				updatedProperty.getDaysOnMarket(),
				updatedProperty.getType(),
				updatedProperty.getYearBuilt(), 
				updatedProperty.getBathroom(),
				updatedProperty.getBed(),
				updatedProperty.getLivingRoom(),
				updatedProperty.getPrice(),
				updatedProperty.getSquareFeet(),
				updatedProperty.getPlotNumber(),
				updatedProperty.getStreetName(),
				updatedProperty.getCity(),
				updatedProperty.getState(),
				updatedProperty.getCountry(),
				updatedProperty.getPinCode(), 
				updatedProperty.getPropertyId());
	}

	@Override
	public void deleteProperty(int propertyId) {
		propertyRepository.deleteById(propertyId);
	}

}
