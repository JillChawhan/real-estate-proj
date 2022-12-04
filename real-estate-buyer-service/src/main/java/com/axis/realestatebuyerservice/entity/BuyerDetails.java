package com.axis.realestatebuyerservice.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class BuyerDetails {
	@GeneratedValue
	@Id
	private long buyerId;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private UserDetails userDetails;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private Property property;
	
	public BuyerDetails() {
		
	}

	public BuyerDetails(UserDetails userDetails, Property property, long buyerId) {
		super();
		this.userDetails = userDetails;
		this.property = property;
		this.buyerId = buyerId;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public long getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(long buyerId) {
		this.buyerId = buyerId;
	}

	@Override
	public String toString() {
		return "BuyerDetails [buyerId=" + buyerId + ", userDetails=" + userDetails + ", property=" + property + "]";
	}

}
