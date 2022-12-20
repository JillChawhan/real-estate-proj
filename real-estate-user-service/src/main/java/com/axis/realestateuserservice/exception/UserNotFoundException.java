package com.axis.realestateuserservice.exception;

public class UserNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -654542L;
	
	public UserNotFoundException() {
		super();
		
	}

	public UserNotFoundException(String message) {
		super(message);
		
	}
	
}