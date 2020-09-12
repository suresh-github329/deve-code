package com.lara.sanitizer.product.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Ingredient 
{
   
	@Id
	private Integer id;
	private String name;
	private String ingreDesc;
	
	@ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinTable(joinColumns = {@JoinColumn(name = "ingredient_id")}, inverseJoinColumns = {@JoinColumn(name = "supplierProductIngredient_id")})
	private List<SupplierProductIngredient> supplierProductIngredient = new ArrayList<SupplierProductIngredient>();
	
	
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
	
	
	public String getIngreDesc() {
		return ingreDesc;
	}
	public void setIngreDesc(String ingreDesc) {
		this.ingreDesc = ingreDesc;
	}
	public List<SupplierProductIngredient> getSupplierProductIngredient() {
		return supplierProductIngredient;
	}
	public void setSupplierProductIngredient(List<SupplierProductIngredient> supplierProductIngredient) {
		for(SupplierProductIngredient supplierProductIngredients: supplierProductIngredient) {
			supplierProductIngredients.getIngredient().add(this);
		}
		this.supplierProductIngredient = supplierProductIngredient;
	}
	
}
 