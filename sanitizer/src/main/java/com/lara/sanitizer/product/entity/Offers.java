package com.lara.sanitizer.product.entity;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Offers {

	@Id
	private Integer id;
	
	@ManyToOne
	@JsonIgnore
	private SupplierProduct supplierProduct;  
	
	private String offerStartDate;
	private String offerEndDate;
	private Float offerPercentage;
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
	
	public String getOfferStartDate() {
		return offerStartDate;
	}
	public void setOfferStartDate(String offerStartDate) {
		this.offerStartDate = offerStartDate;
	}
	public String getOfferEndDate() {
		return offerEndDate;
	}
	public void setOfferEndDate(String offerEndDate) {
		this.offerEndDate = offerEndDate;
	}
	public Float getOfferPercentage() {
		return offerPercentage;
	}
	public void setOfferPercentage(Float offerPercentage) {
		this.offerPercentage = offerPercentage;
	}
	
}
