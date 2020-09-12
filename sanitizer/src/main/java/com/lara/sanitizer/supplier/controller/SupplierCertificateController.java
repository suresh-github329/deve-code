package com.lara.sanitizer.supplier.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lara.sanitizer.supplier.entity.SupplierCertificate;
import com.lara.sanitizer.supplier.service.SupplierCertificateService;

@RestController
@CrossOrigin
@RequestMapping(path = "/supplierCertificate")
public class SupplierCertificateController {
	
	@Autowired
	private SupplierCertificateService supplierCertificateService;
	
	@PostMapping
	public SupplierCertificate save(@RequestBody SupplierCertificate supplierCertificate) {
		
		return supplierCertificateService.Save(supplierCertificate);
	}
	
	@GetMapping
	public List<SupplierCertificate> readAll()
	{
		return supplierCertificateService.readAll();
	}
	
	@PutMapping
	public SupplierCertificate update(@RequestBody SupplierCertificate supplierCertificate) {
		return supplierCertificateService.update(supplierCertificate);
	}
	
	@GetMapping(path = "/{id}")
	public SupplierCertificate read(@PathVariable Integer id)
	{
		return supplierCertificateService.read(id);
	}
	
	@DeleteMapping(path = "/{id}")
	public SupplierCertificate delete(@PathVariable Integer id)
	{
		return supplierCertificateService.delete(id);
	}


}
