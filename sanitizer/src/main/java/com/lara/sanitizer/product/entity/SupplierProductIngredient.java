package com.lara.sanitizer.product.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class SupplierProductIngredient {
	
	
	@Id
	private Integer id;
	
	@ManyToOne
	@JsonIgnore
	private SupplierProduct supplierProduct;
	
	@ManyToMany(mappedBy = "supplierProductIngredient")
	@JsonIgnore
	private List<Ingredient> ingredient = new ArrayList<Ingredient>();
	
	private float percentage;

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

	public List<Ingredient> getIngredient() {
		return ingredient;
	}

	public void setIngredient(List<Ingredient> ingredient) {
		this.ingredient = ingredient;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
	
	

}
