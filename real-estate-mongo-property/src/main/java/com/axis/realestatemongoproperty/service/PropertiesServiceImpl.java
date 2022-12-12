package com.axis.realestatemongoproperty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.realestatemongoproperty.entity.Properties;
import com.axis.realestatemongoproperty.repository.PropertiesRepository;

@Service
public class PropertiesServiceImpl implements PropertiesService {
	
	@Autowired
	PropertiesRepository propertiesRepository;
	
	@Override
	public List<Properties> getAllProperties() {
		return propertiesRepository.findAll();
	}

	@Override
	public void addProperty(Properties property) {
		propertiesRepository.save(property);
	}

	@Override
	public void deletePropertyById(String propertyId) {
		propertiesRepository.deleteById(propertyId);
	}

	@Override
	public void updatePropertybyId(String propertyId, Properties updatedProperty) {
		propertiesRepository.save(updatedProperty);
	}

	@Override
	public Properties getPropertyById(String propertyId) {
		return propertiesRepository.findById(propertyId).get();
	}

}
