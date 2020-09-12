package com.lara.sanitizer.product.entity;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lara.sanitizer.customer.entity.OrderItems;
import com.lara.sanitizer.supplier.entity.Supplier;


@Entity
public class SupplierProduct {

	@Id
	private Integer id;
	
	@ManyToOne
	@JsonIgnore
	private Product product;
	
	@ManyToOne
	@JsonIgnore
	private Supplier supplier;
	
	private Double price;
	private String productImgUrl;
	private Integer size;
	
	@ManyToOne
	@JsonIgnore
	private Manufacturer manufacturer;
	
	private String manufactureDate;
	private String expiryDate;
	private Integer noOfDaysToDeliver;
	private String handleWithCare;
	private Float commisionPercentage;
	
	@OneToMany(mappedBy="supplierProduct",cascade=CascadeType.ALL)
	private List<SupplierProductIngredient> supplierProductIngredient = new ArrayList<SupplierProductIngredient>();
	
	@OneToMany(mappedBy = "supplierProduct",cascade = CascadeType.ALL)
	private List<AvailableStock> availableStocks = new ArrayList<AvailableStock>();
	
	@OneToMany(mappedBy = "supplierProduct",cascade = CascadeType.ALL)
	private List<Offers> offers = new ArrayList<Offers>();
	
	@OneToMany(mappedBy = "supplierProduct",cascade = CascadeType.ALL)
	private List<ReviewsRatings> reviewsRatings = new ArrayList<ReviewsRatings>();
	
	@OneToMany(mappedBy = "supplierProduct",cascade = CascadeType.ALL)
	private List<Refund> refund = new ArrayList<Refund>();
	
	@OneToMany(mappedBy = "supplierProduct",cascade = CascadeType.ALL)
	private List<RefundTx> refundTx = new ArrayList<RefundTx>();
	
	@ManyToMany(mappedBy = "supplierProductId")
	@JsonIgnore
	private List<OrderItems> orderItemList = new ArrayList<OrderItems>();
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getProductImgUrl() {
		return productImgUrl;
	}
	public void setProductImgUrl(String productImgUrl) {
		this.productImgUrl = productImgUrl;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Integer getNoOfDaysToDeliver() {
		return noOfDaysToDeliver;
	}
	public void setNoOfDaysToDeliver(Integer noOfDaysToDeliver) {
		this.noOfDaysToDeliver = noOfDaysToDeliver;
	}
	public String getHandleWithCare() {
		return handleWithCare;
	}
	public void setHandleWithCare(String handleWithCare) {
		this.handleWithCare = handleWithCare;
	}
	public Float getCommisionPercentage() {
		return commisionPercentage;
	}
	public void setCommisionPercentage(Float commisionPercentage) {
		this.commisionPercentage = commisionPercentage;
	}
	
	public List<SupplierProductIngredient> getSupplierProductIngredient() {
		return supplierProductIngredient;
	}
	public void setSupplierProductIngredient(List<SupplierProductIngredient> supplierProductIngredient) {
		this.supplierProductIngredient = supplierProductIngredient;
	}
	public List<AvailableStock> getAvailableStocks() {
		return availableStocks;
	}
	public void setAvailableStocks(List<AvailableStock> availableStocks) {
		this.availableStocks = availableStocks;
	}
	public List<Offers> getOffers() {
		return offers;
	}
	public void setOffers(List<Offers> offers) {
		this.offers = offers;
	}
	public List<ReviewsRatings> getReviewsRatings() {
		return reviewsRatings;
	}
	public void setReviewsRatings(List<ReviewsRatings> reviewsRatings) {
		this.reviewsRatings = reviewsRatings;
	}
	public List<Refund> getRefund() {
		return refund;
	}
	public void setRefund(List<Refund> refund) {
		this.refund = refund;
	}
	public List<RefundTx> getRefundTx() {
		return refundTx;
	}
	public void setRefundTx(List<RefundTx> refundTx) {
		this.refundTx = refundTx;
	}
	public List<OrderItems> getOrderItemList() {
		return orderItemList;
	}
	public void setOrderItemList(List<OrderItems> orderItemList) {
		this.orderItemList = orderItemList;
	}
	
	
	
}

