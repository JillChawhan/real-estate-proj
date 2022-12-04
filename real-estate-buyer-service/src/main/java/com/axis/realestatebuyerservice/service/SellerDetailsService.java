package com.axis.realestatebuyerservice.service;

import java.util.List;

import com.axis.realestatebuyerservice.entity.SellerDetails;

public interface SellerDetailsService {
	List<SellerDetails> getAllSellers();
	
	SellerDetails getSellerById(long sellerId);
	
	void addSeller(SellerDetails sellerDetails);
	
	void updateSeller(long sellerId, SellerDetails updatedSellerDetails);
	
	void deleteSellerById(long sellerId);
	
}
