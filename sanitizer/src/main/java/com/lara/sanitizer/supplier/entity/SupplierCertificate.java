package com.lara.sanitizer.supplier.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SupplierCertificate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String certificateName;
	private String description;
	private String issuedBy;
	private String imageUrl;
	
	@ManyToOne
	@JsonIgnore
	private Supplier supplier; 
	
}
