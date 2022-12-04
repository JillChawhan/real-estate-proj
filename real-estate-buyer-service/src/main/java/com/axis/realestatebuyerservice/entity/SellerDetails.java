package com.axis.realestatebuyerservice.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class SellerDetails {
	@GeneratedValue
	@Id
	private long sellerId;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private UserDetails userDetails;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private Property property;
	
	public SellerDetails() {
		
	}

	public SellerDetails(UserDetails userDetails, Property property, long sellerId) {
		super();
		this.userDetails = userDetails;
		this.property = property;
		this.sellerId = sellerId;
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

	public long getSellerId() {
		return sellerId;
	}

	public void setSellerId(long sellerId) {
		this.sellerId = sellerId;
	}

	@Override
	public String toString() {
		return "SellerDetails [sellerId=" + sellerId + ", userDetails=" + userDetails + ", property=" + property + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(sellerId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SellerDetails other = (SellerDetails) obj;
		return sellerId == other.sellerId;
	}
	
	
}
