package com.axis.realestatesellerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.realestatesellerservice.entity.SellerDetails;
import com.axis.realestatesellerservice.repository.SellerDetailsRepository;

@Service
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
