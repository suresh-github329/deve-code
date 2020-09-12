package com.lara.sanitizer.product.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

	@Id
	private Integer id;
	private String name;
	private String categoryDesc;
	@OneToMany(mappedBy="category", cascade=CascadeType.ALL)
	private List<ProductType> productTypes = new ArrayList<ProductType>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategoryDesc() {
		return categoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}
	public List<ProductType> getProductTypes() {
		return productTypes;
	}
	public void setProductTypes(List<ProductType> productTypes) {
		this.productTypes = productTypes;
	}
	
	
	
	
}
