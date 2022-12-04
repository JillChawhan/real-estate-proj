package com.axis.realestatesellerservice.entity;
//package com.axis.realestatedemo.entity;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Entity;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;
//
//@Entity
//public class LeaseDetails {
//	private int leasePeriodInMonths;
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn
//	private UserDetails userDetails;
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn
//	private Property property;
//	
//	public LeaseDetails() {
//		
//	}
//
//	public LeaseDetails(int leasePeriodInMonths, UserDetails userDetails, Property property) {
//		super();
//		this.leasePeriodInMonths = leasePeriodInMonths;
//		this.userDetails = userDetails;
//		this.property = property;
//	}
//
//	public int getLeasePeriodInMonths() {
//		return leasePeriodInMonths;
//	}
//
//	public void setLeasePeriodInMonths(int leasePeriodInMonths) {
//		this.leasePeriodInMonths = leasePeriodInMonths;
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
//		return "LeaseDetails [leasePeriodInMonths=" + leasePeriodInMonths + ", userDetails=" + userDetails
//				+ ", property=" + property + "]";
//	}
//	
//}
