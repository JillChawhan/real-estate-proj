package com.axis.realestatebuyerservice.service;

import java.util.List;

import com.axis.realestatebuyerservice.entity.UserDetails;

public interface UserDetailsService {
	
	// All Users
	List<UserDetails> getAllUsers();
	
	// get user by id
	UserDetails getUserById(long userId);
	
	// add user
	void addUser(UserDetails userDetails);
	
	// update user
	void updateUser(long userId, UserDetails updatedUserDetails);
	
	// delete user
	void deleteUser(long userId);
	
}
