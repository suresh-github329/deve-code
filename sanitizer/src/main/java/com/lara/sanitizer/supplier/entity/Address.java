package com.lara.sanitizer.supplier.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String lane1;
	private String lane2;
	private String district;
	private String state;
	private String country;
	private String pinCode;
	
	@OneToOne
	@JsonIgnore
	private Supplier supplier;
	
}
