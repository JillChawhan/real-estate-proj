package com.axis.realestatedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axis.realestatedemo.entity.Property;
import com.axis.realestatedemo.service.PropertyService;

@RestController
public class PropertyController {
	
	@Autowired
	PropertyService propertyService;
	
	@GetMapping("/properties")
	public List<Property> getAllProperty(){
		return propertyService.getAllProperty();
	}
	
	@GetMapping("/property/{propertyId}")
	public Property getPropertyById(@PathVariable int propertyId) {
		return propertyService.getPropertyById(propertyId);
	}
	
	@PostMapping("/property")
	public ResponseEntity<String> addProperty(@RequestBody Property property){
		propertyService.addProperty(property);
		return new ResponseEntity<String>("Property added successfully...", HttpStatus.CREATED);
	}
	
	@PutMapping("/property/update/{propertyId}")
	public ResponseEntity<String> updateProperty(@PathVariable int propertyId, @RequestBody Property updatedProperty){
		if(propertyId!=updatedProperty.getPropertyId()) {
			return new ResponseEntity<String>("Property with ID: "+propertyId+" not found...", HttpStatus.NOT_FOUND);
		}
		else {
			propertyService.updateProperty(propertyId, updatedProperty);
			return new ResponseEntity<String>("Property with ID: "+propertyId+" updated successfully...",HttpStatus.OK);
		}
	}
	
	@DeleteMapping("/property/delete/{propertyId}")
	public ResponseEntity<String> deletePropertyById(@PathVariable int propertyId){
		propertyService.deleteProperty(propertyId);
		return new ResponseEntity<String>("Property with ID: "+propertyId+"deleted successfully...", HttpStatus.OK);
	}
}
