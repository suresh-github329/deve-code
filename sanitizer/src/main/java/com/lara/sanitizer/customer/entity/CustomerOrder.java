package com.lara.sanitizer.customer.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lara.sanitizer.Util;


@Entity
public class CustomerOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String orderDate;
	
	@Enumerated(EnumType.STRING)
	private Util.status orderStatus;
	
	@ManyToOne
	@JsonIgnore
	private Customer customer;
	
	@OneToOne(mappedBy = "customerOrder",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private OrderAddress orderAddress;
	
	@OneToMany(mappedBy = "customerOrder", cascade = CascadeType.ALL)
	private List<OrderItems> orderItems= new ArrayList<OrderItems>();

	public Util.status getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Util.status orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public OrderAddress getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(OrderAddress orderAddress) {
		this.orderAddress = orderAddress;
	}

	public List<OrderItems> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItems> orderItems) {
		this.orderItems = orderItems;
	}

	@Override
	public String toString() {
		return "CustomerOrder [getOrderStatus()=" + getOrderStatus() + ", getId()=" + getId() + ", getOrderDate()="
				+ getOrderDate() + "," + ", getOrderAddress()=" +
				getOrderAddress().getId()+ ", getOrderItems()=" + getOrderItems().get(0).getId() + "]";
	}

	
	
	
	
}
