package com.lara.sanitizer.product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class RefundTx {

	@Id
	private Integer id;
	
	@ManyToOne
	@JsonIgnore
	private SupplierProduct supplierProduct;
	
	// private Order order; // manyToOne ,dependent on Customer module or order table
	
	// private Customer customer; // manyToOne ,dependent on Customer module or customer table
	
	private Integer refundQuantity;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SupplierProduct getSupplierProduct() {
		return supplierProduct;
	}

	public void setSupplierProduct(SupplierProduct supplierProduct) {
		this.supplierProduct = supplierProduct;
	}

	public Integer getRefundQuantity() {
		return refundQuantity;
	}

	public void setRefundQuantity(Integer refundQuantity) {
		this.refundQuantity = refundQuantity;
	}
	
	
}
