package com.axis.realestateuserservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axis.realestateuserservice.entity.UserDetails;
import com.axis.realestateuserservice.service.UserDetailsService;

@RestController
public class UserDetailsController {
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@GetMapping("/users")
	public List<UserDetails> findAllUsers(){
		return userDetailsService.getAllUsers();
	}
	
	@GetMapping("/user/{userId}")
	public UserDetails findUserById(@PathVariable long userId) {
		return userDetailsService.getUserById(userId);
	}
	
	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody UserDetails userDetails){
		userDetailsService.addUser(userDetails);
		return new ResponseEntity<String>("New user added successfully...", 
				HttpStatus.CREATED);
	}
	
	@PutMapping("/user/update/{userId}")
	public ResponseEntity<String> updateUserInfo(@PathVariable long userId,
			@RequestBody UserDetails updatedUserDetails){
		if(userId!=updatedUserDetails.getUserId()) {
			return new ResponseEntity<String>("User with ID: "+userId+" not found...",
					HttpStatus.NOT_FOUND);
		}
		else {
			userDetailsService.updateUser(userId, updatedUserDetails);
			return new ResponseEntity<String>("User with ID: "+userId+
					" updated successfully...", HttpStatus.OK);
		}
	}
	
	@DeleteMapping("/user/delete/{userId}")
	public ResponseEntity<String> deleteUserById(@PathVariable long userId){
		userDetailsService.deleteUser(userId);
		return new ResponseEntity<String>("User with ID: "+userId+" deleted successfully...", HttpStatus.OK);
	}
	
	
}
