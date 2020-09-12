package com.lara.sanitizer.supplier.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.lara.sanitizer.product.entity.SupplierProduct;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Supplier {

		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Integer id;
		private String companyName;
		private String webUrl;
		private Long landlineNumber;
		
		@OneToOne(mappedBy = "supplier",cascade = CascadeType.ALL)
		private Address address;
		
		@OneToOne(mappedBy = "supplier",cascade = CascadeType.ALL)
		private LoginDetails loginDetails;
		
		@OneToMany(mappedBy = "supplier",cascade = CascadeType.ALL)
		private List<SupplierOwner> supplierOwner=new ArrayList<SupplierOwner>();
		
		@OneToMany(mappedBy = "supplier",cascade = CascadeType.ALL)
		private List<SupplierContactPerson> supplierContactPerson=new ArrayList<SupplierContactPerson>();
		
		@OneToMany(mappedBy = "supplier",cascade = CascadeType.ALL)
		private List<SupplierBankAcInfo> supplierBankAcInfo=new ArrayList<SupplierBankAcInfo>();
		
		@OneToMany(mappedBy = "supplier",cascade = CascadeType.ALL)
		private List<SupplierCertificate> supplierCertificate=new ArrayList<SupplierCertificate>();
		
		@OneToMany(mappedBy = "supplier",cascade = CascadeType.ALL)
		private List<Document> document=new ArrayList<Document>();
		
		@OneToMany(mappedBy="supplier",cascade=CascadeType.ALL)
		private List<SupplierProduct> supplierProducts = new ArrayList<SupplierProduct>();
			
}
