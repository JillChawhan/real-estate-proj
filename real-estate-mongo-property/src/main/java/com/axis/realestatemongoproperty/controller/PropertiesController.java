package com.axis.realestatemongoproperty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axis.realestatemongoproperty.entity.Properties;
import com.axis.realestatemongoproperty.service.PropertiesService;

@CrossOrigin("http://localhost:3000")
@RestController
public class PropertiesController {
	
	@Autowired
	PropertiesService propertiesService;
	
	@GetMapping("/properties")
    public List<Properties> getAllProperties(){
        return  propertiesService.getAllProperties();
    }

    @GetMapping("/property/{propertyId}")
    public Properties getPropertyById(@PathVariable String propertyId) {
        return propertiesService.getPropertyById(propertyId);
    }

    @PostMapping("/property")
    public ResponseEntity<String> addPropertyById(@RequestBody Properties property){
    	propertiesService.addProperty(property);
        return new ResponseEntity<String>("New Property Added...",HttpStatus.CREATED);
    }

    @DeleteMapping("/property/delete/{propertyId}")
    public ResponseEntity<String> deletePropertyById(@PathVariable String movieId){
    	propertiesService.deletePropertyById(movieId);
        return new ResponseEntity<String>("Movie with ID: " +movieId +" is Deleted!!!",HttpStatus.OK);
    }

    @PutMapping("/property/update/{propertyId}")
    public ResponseEntity<String> updateProperty(@PathVariable String propertyId,@RequestBody Properties updatedProperty){
        if(propertyId.equals(updatedProperty.getPropertyId())) {
        	propertiesService.updatePropertybyId(propertyId, updatedProperty);
            return new ResponseEntity<String>("Property updated Successfully..!!", HttpStatus.OK);
        }else {
            return new ResponseEntity<String>("Property with provided ID not found", HttpStatus.BAD_REQUEST);
        }
    }
	
}
