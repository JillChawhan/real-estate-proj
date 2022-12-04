package com.axis.realestateuserservice.entity;
//package com.axis.realestatedemo.entity;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;
//
//@JsonIgnoreProperties({"hibernateLazyInitializer"})
//@Entity
//public class BuyerDetails {
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn
//	private UserDetails userDetails;
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn
//	private Property property;
//	
//	public BuyerDetails() {
//		
//	}
//
//	public BuyerDetails(UserDetails userDetails, Property property) {
//		super();
//		this.userDetails = userDetails;
//		this.property = property;
//	}
//
//	public UserDetails getUserDetails() {
//		return userDetails;
//	}
//
//	public void setUserDetails(UserDetails userDetails) {
//		this.userDetails = userDetails;
//	}
//
//	public Property getProperty() {
//		return property;
//	}
//
//	public void setProperty(Property property) {
//		this.property = property;
//	}
//
//	@Override
//	public String toString() {
//		return "BuyerDetails [userDetails=" + userDetails + ", property=" + property + "]";
//	}
//	
//}
