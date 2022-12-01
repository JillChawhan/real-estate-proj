package com.axis.realestatedemo.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Property {
	@Id
	@GeneratedValue
	private int propertyId;
	private String status;
	private int daysOnMarket;
	private String type;
	private int yearBuilt;
	private int bathroom;
	private int bed;
	private int livingRoom;
	private long price;
	private double squareFeet;
	private String plotNumber;
	private String streetName;
	private String city;
	private String state;
	private String country;
	private int pinCode;
	
	public Property() {
		
	}

	public Property(int propertyId, String status, int daysOnMarket, String type, int yearBuilt, int bathroom, int bed,
			int livingRoom, long price, double squareFeet, String plotNumber, String streetName, String city,
			String state, String country, int pinCode) {
		super();
		this.propertyId = propertyId;
		this.status = status;
		this.daysOnMarket = daysOnMarket;
		this.type = type;
		this.yearBuilt = yearBuilt;
		this.bathroom = bathroom;
		this.bed = bed;
		this.livingRoom = livingRoom;
		this.price = price;
		this.squareFeet = squareFeet;
		this.plotNumber = plotNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pinCode = pinCode;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getDaysOnMarket() {
		return daysOnMarket;
	}

	public void setDaysOnMarket(int daysOnMarket) {
		this.daysOnMarket = daysOnMarket;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	public int getBathroom() {
		return bathroom;
	}

	public void setBathroom(int bathroom) {
		this.bathroom = bathroom;
	}

	public int getBed() {
		return bed;
	}

	public void setBed(int bed) {
		this.bed = bed;
	}

	public int getLivingRoom() {
		return livingRoom;
	}

	public void setLivingRoom(int livingRoom) {
		this.livingRoom = livingRoom;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public double getSquareFeet() {
		return squareFeet;
	}

	public void setSquareFeet(double squareFeet) {
		this.squareFeet = squareFeet;
	}

	public String getPlotNumber() {
		return plotNumber;
	}

	public void setPlotNumber(String plotNumber) {
		this.plotNumber = plotNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Property [propertyId=" + propertyId + ", status=" + status + ", daysOnMarket=" + daysOnMarket
				+ ", type=" + type + ", yearBuilt=" + yearBuilt + ", bathroom=" + bathroom + ", bed=" + bed
				+ ", livingRoom=" + livingRoom + ", price=" + price + ", squareFeet=" + squareFeet + ", plotNumber="
				+ plotNumber + ", streetName=" + streetName + ", city=" + city + ", state=" + state + ", country="
				+ country + ", pinCode=" + pinCode + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(propertyId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Property other = (Property) obj;
		return propertyId == other.propertyId;
	}
	
}
