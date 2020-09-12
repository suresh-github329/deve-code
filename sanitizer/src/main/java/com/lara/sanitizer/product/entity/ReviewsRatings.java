package com.lara.sanitizer.product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ReviewsRatings {
	
	@Id
	private Integer id;
	
	@ManyToOne
	@JsonIgnore
	private SupplierProduct supplierProduct;
	
	private Integer ratingNumber;
	private String reviewComment;
	private String deliveryImage;
	
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
	public Integer getRatingNumber() {
		return ratingNumber;
	}
	public void setRatingNumber(Integer ratingNumber) {
		this.ratingNumber = ratingNumber;
	}
	public String getReviewComment() {
		return reviewComment;
	}
	public void setReviewComment(String reviewComment) {
		this.reviewComment = reviewComment;
	}
	public String getDeliveryImage() {
		return deliveryImage;
	}
	public void setDeliveryImage(String deliveryImage) {
		this.deliveryImage = deliveryImage;
	}
	
	
}
