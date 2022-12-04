package com.axis.realestatebuyerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.realestatebuyerservice.entity.BuyerDetails;
import com.axis.realestatebuyerservice.repository.BuyerDetailsRepository;

@Service
public class BuyerDetailServiceImpl implements BuyerDetailsService {

	@Autowired
	BuyerDetailsRepository buyerDetailsRepository;
	
	@Override
	public List<BuyerDetails> getAllBuyers() {
		return (List<BuyerDetails>) buyerDetailsRepository.findAll();
	}

	@Override
	public BuyerDetails getBuyerById(long buyerId) {
		return buyerDetailsRepository.findById(buyerId).get();
	}

	@Override
	public void addBuyer(BuyerDetails buyerDetails) {
		buyerDetailsRepository.save(buyerDetails);
	}

	@Override
	public void updateBuyer(long buyerId, BuyerDetails buyerDetails) {

	}

	@Override
	public void deleteBuyerById(long buyerId) {
		buyerDetailsRepository.deleteById(buyerId);
	}

}
