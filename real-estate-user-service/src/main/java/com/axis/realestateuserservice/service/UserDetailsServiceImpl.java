package com.axis.realestateuserservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.realestateuserservice.entity.UserDetails;
import com.axis.realestateuserservice.exception.UserNotFoundException;
import com.axis.realestateuserservice.repository.UserDetailsRepository;

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
		Optional<UserDetails> userDetOpt = userDetailsRepository.findById(userId);
		if(!userDetOpt.isPresent()) {
			throw new UserNotFoundException("User with ID: "+userId+" not found.");
		}
		return userDetOpt.get();
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

	@Override
	public UserDetails getUserByEmail(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
