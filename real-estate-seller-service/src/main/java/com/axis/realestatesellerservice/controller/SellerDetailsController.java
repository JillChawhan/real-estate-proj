package com.axis.realestatesellerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axis.realestatesellerservice.entity.SellerDetails;
import com.axis.realestatesellerservice.service.SellerDetailsService;

@RestController
public class SellerDetailsController {
	
	@Autowired
	SellerDetailsService sellerDetailsService;
	
	// find all
	@GetMapping("/sellers")
	public List<SellerDetails> listAllSeller(){
		return sellerDetailsService.getAllSellers();
	}
	
	// find by id
	@GetMapping("/seller/{sellerId}")
	public SellerDetails getSellerById(@PathVariable long sellerId) {
		return sellerDetailsService.getSellerById(sellerId);
	}
	
	// add seller
	@PostMapping("/seller")
	public ResponseEntity<String> putNewSeller(@RequestBody SellerDetails sellerDetails){
		sellerDetailsService.addSeller(sellerDetails);
		return new ResponseEntity<String>("New seller Added...",HttpStatus.CREATED);
	}
	
	// delete seller
	@DeleteMapping("/seller/{sellerId}")
	public ResponseEntity<String> deleteSeller(@PathVariable long sellerId){
		sellerDetailsService.deleteSellerById(sellerId);
		return new ResponseEntity<String>("Seller with ID: "+sellerId+" deleted...",HttpStatus.OK);
	}
	
}
