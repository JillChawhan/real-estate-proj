package com.axis.realestatesellerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.realestatesellerservice.entity.UserDetails;
import com.axis.realestatesellerservice.repository.UserDetailsRepository;

import javax.transaction.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	@Override
	public List<UserDetails> getAllUsers() {
		return (List<UserDetails>) userDetailsRepository.findAll();
	}
	
	@Override
	public UserDetails getUserById(long userId) {
		return userDetailsRepository.findById(userId).get();
	}

	
	@Override
	public void addUser(UserDetails userDetails) {
		userDetailsRepository.save(userDetails);
	}
	
	@Transactional
	@Override
	public void updateUser(long userId, UserDetails updatedUserDetails) {
		userDetailsRepository.updateUserInfo(updatedUserDetails.getFirstName(),
				updatedUserDetails.getLastName(), 
				updatedUserDetails.getEmailId(),
				updatedUserDetails.getPhoneNumber(),
				updatedUserDetails.getPassword(),
				updatedUserDetails.getUserId());
	}

	@Override
	public void deleteUser(long userId) {
		userDetailsRepository.deleteById(userId);
	}

	
}
