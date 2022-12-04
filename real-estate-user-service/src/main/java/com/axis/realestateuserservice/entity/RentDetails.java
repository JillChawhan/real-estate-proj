package com.axis.realestateuserservice.entity;
//package com.axis.realestatedemo.entity;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;
//
//@Entity
//public class RentDetails {
//	
//	private int rentPeriodInMonths;
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn
//	private UserDetails userDetails;
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn
//	private Property property;
//
//	public RentDetails() {
//		
//	}
//	
//	public RentDetails(int rentPeriodInMonths, UserDetails userDetails, Property property) {
//		super();
//		this.rentPeriodInMonths = rentPeriodInMonths;
//		this.userDetails = userDetails;
//		this.property = property;
//	}
//
//	public int getRentPeriodInMonths() {
//		return rentPeriodInMonths;
//	}
//
//	public void setRentPeriodInMonths(int rentPeriodInMonths) {
//		this.rentPeriodInMonths = rentPeriodInMonths;
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
//		return "RentDetails [rentPeriodInMonths=" + rentPeriodInMonths + ", userDetails=" + userDetails + ", property="
//				+ property + "]";
//	}
//	
//}
