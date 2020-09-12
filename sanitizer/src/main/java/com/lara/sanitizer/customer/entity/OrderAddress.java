package com.lara.sanitizer.customer.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class OrderAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String fullName;
	private String mobileNumber;
	private Integer pincode;
	private String  cityName;
	private String state;
	private String houseNo;
	private String street;
	private String landmark;
	
	@OneToOne
	@JsonIgnore
	private CustomerOrder customerOrder;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public CustomerOrder getCustomerOrder() {
		return customerOrder;
	}
	public void setCustomerOrder(CustomerOrder customerOrder) {
		this.customerOrder = customerOrder;
	}
	@Override
	public String toString() {
		return "OrderAddress [getId()=" + getId() + ", getFullName()=" + getFullName() + ", getMobileNumber()="
				+ getMobileNumber() + ", getPincode()=" + getPincode() + ", getCityName()=" + getCityName()
				+ ", getState()=" + getState() + ", getHouseNo()=" + getHouseNo() + ", getStreet()=" + getStreet()
				+ ", getLandmark()=" + getLandmark() + ", getCustomerOrder()=" + getCustomerOrder().getId() + "]";
	}
	
	
	
	
	

}
