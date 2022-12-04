package com.axis.realestatebuyerservice.service;

import java.util.List;

import com.axis.realestatebuyerservice.entity.BuyerDetails;

public interface BuyerDetailsService {
	List<BuyerDetails> getAllBuyers();
	
	BuyerDetails getBuyerById(long buyerId);
	
	void addBuyer(BuyerDetails buyerDetails);
	
	void updateBuyer(long buyerId, BuyerDetails buyerDetails);
	
	void deleteBuyerById(long buyerId);
}
