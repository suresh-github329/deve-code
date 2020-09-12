package com.lara.sanitizer.supplier.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lara.sanitizer.supplier.entity.SupplierCertificate;
import com.lara.sanitizer.supplier.repository.SupplierCertificateRepository;


@Service
public class SupplierCertificateService {

	@Autowired
	private SupplierCertificateRepository supplierCertificateRepo;
	
	public void deleteAllSupplierContactPersonBySupplierId(Integer id) {
		List<SupplierCertificate> supplierCertificate =supplierCertificateRepo.findSupplierCertificateBySupplierId(id);
		if(supplierCertificate !=null && supplierCertificate.size() !=0) {
			supplierCertificateRepo.deleteAll();
		}
		System.out.println("All got deleted");
	}
	
	public SupplierCertificate Save(SupplierCertificate supplierCertificate) {
		return supplierCertificateRepo.save(supplierCertificate);
	}
	
	public List<SupplierCertificate> readAll(){
		List<SupplierCertificate> supplierCertificates=(List<SupplierCertificate>) supplierCertificateRepo.findAll();
		return supplierCertificates;
	}
	
	public SupplierCertificate read(Integer id) {
		return supplierCertificateRepo.findById(id).get();
	}
	
	public SupplierCertificate update(SupplierCertificate supplierCertificate) {
		return supplierCertificateRepo.save(supplierCertificate);
	}
	
	public SupplierCertificate delete(Integer id) {
		SupplierCertificate supplierCertificate=supplierCertificateRepo.findById(id).get();
		supplierCertificateRepo.deleteById(id);
		 return supplierCertificate;
	}
}
