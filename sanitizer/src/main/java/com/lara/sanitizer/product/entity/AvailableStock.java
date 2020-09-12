package com.lara.sanitizer.product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class AvailableStock {
	
	@Id
	private Integer id;
	@ManyToOne
	@JsonIgnore
	private SupplierProduct supplierProduct;
	private Integer quantity;
	
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
	public SupplierProduct getSupplierProduct() {
		return supplierProduct;
	}
	public void setSupplierProduct(SupplierProduct supplierProduct) {
		this.supplierProduct = supplierProduct;
	}
	
}
