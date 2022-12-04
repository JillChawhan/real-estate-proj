package com.axis.realestatebuyerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.axis.realestatebuyerservice.entity.SellerDetails;
import com.axis.realestatebuyerservice.repository.SellerDetailsRepository;

public class SellerDetailsServiceImpl implements SellerDetailsService {

	@Autowired
	SellerDetailsRepository sellerDetailsRepository;
	
	@Override
	public List<SellerDetails> getAllSellers() {
		return (List<SellerDetails>) sellerDetailsRepository.findAll();
	}

	@Override
	public SellerDetails getSellerById(long sellerId) {
		return sellerDetailsRepository.findById(sellerId).get();
	}

	@Override
	public void updateSeller(long sellerId, SellerDetails updatedSellerDetails) {
	
	}

	@Override
	public void deleteSellerById(long sellerId) {
		sellerDetailsRepository.deleteById(sellerId);
	}

	@Override
	public void addSeller(SellerDetails sellerDetails) {
		sellerDetailsRepository.save(sellerDetails);
	}

}
