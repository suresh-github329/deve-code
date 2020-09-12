package com.lara.sanitizer.product.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Manufacturer {
	
	@Id
	private Integer id;
	private String name;
	private String address;
	
	@OneToMany(mappedBy="manufacturer", cascade=CascadeType.ALL)
	private List<SupplierProduct> supplierProducts =new ArrayList<SupplierProduct>();

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<SupplierProduct> getSupplierProducts() {
		return supplierProducts;
	}

	public void setSupplierProducts(List<SupplierProduct> supplierProducts) {
		this.supplierProducts = supplierProducts;
	}
	

}
