package com.axis.realestatebuyerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.realestatebuyerservice.entity.BuyerDetails;
import com.axis.realestatebuyerservice.service.BuyerDetailsService;

@RestController
public class BuyerDetailsController {
	
	@Autowired
	BuyerDetailsService buyerDetailsService;
	
	@GetMapping("/buyers")
	public List<BuyerDetails> listAllBuyers(){
		return buyerDetailsService.getAllBuyers();
	}
	
	@GetMapping("/buyer/{buyerId}")
	public BuyerDetails findBuyerById(long buyerId) {
		return buyerDetailsService.getBuyerById(buyerId);
	}
	
	@PostMapping("/buyer")
	public ResponseEntity<String> addNewBuyer(BuyerDetails buyerDetails){
		buyerDetailsService.addBuyer(buyerDetails);
		return new ResponseEntity<String>("Buyer added...", HttpStatus.CREATED);
	}
	
	@DeleteMapping("/buyer/{buyerId}")
	public ResponseEntity<String> deleteBuyer(long buyerId){
		buyerDetailsService.deleteBuyerById(buyerId);
		return new ResponseEntity<String>("Buyer with ID: "+buyerId+"deleted...", HttpStatus.OK);
	}
}
