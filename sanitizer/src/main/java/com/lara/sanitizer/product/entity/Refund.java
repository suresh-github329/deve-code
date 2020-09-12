package com.lara.sanitizer.product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Refund {
	
	@Id
	private Integer id;
	
	@ManyToOne
	@JsonIgnore
	private SupplierProduct supplierProduct;
	
	private Integer productReturnPeriod;
	private String refundPolicies;
	private Integer moneyRefundPeriod;
	
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
	public Integer getProductReturnPeriod() {
		return productReturnPeriod;
	}
	public void setProductReturnPeriod(Integer productReturnPeriod) {
		this.productReturnPeriod = productReturnPeriod;
	}
	public String getRefundPolicies() {
		return refundPolicies;
	}
	public void setRefundPolicies(String refundPolicies) {
		this.refundPolicies = refundPolicies;
	}
	public Integer getMoneyRefundPeriod() {
		return moneyRefundPeriod;
	}
	public void setMoneyRefundPeriod(Integer moneyRefundPeriod) {
		this.moneyRefundPeriod = moneyRefundPeriod;
	}
	
}
