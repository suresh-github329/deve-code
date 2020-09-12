package com.lara.sanitizer.customer.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lara.sanitizer.product.entity.SupplierProduct;

@Entity
public class OrderItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer quantity;
	
	@ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinTable(joinColumns={@JoinColumn(name="orderItems_id")},
	inverseJoinColumns = {@JoinColumn(name="supplierProduct_id")})
	private List<SupplierProduct> supplierProductId = new ArrayList<SupplierProduct>();
	
	@ManyToOne
	@JsonIgnore
	private CustomerOrder customerOrder;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public CustomerOrder getCustomerOrder() {
		return customerOrder;
	}

	public void setCustomerOrder(CustomerOrder customerOrder) {
		this.customerOrder = customerOrder;
	}
	

	public List<SupplierProduct> getSupplierProductId() {
		return supplierProductId;
	}

	public void setSupplierProductId(List<SupplierProduct> supplierProductId) {
		for(SupplierProduct supplierProductIds : supplierProductId)
		{
			supplierProductIds.getOrderItemList().add(this);
		}
		this.supplierProductId = supplierProductId;
	}

	@Override
	public String toString() {
		return "OrderItems [getId()=" + getId() + ", getQuantity()=" + getQuantity() + ", getCustomerOrder()="
				+ getCustomerOrder().getId() + "]";
	}
	
	
	
}
