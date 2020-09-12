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

import com.lara.sanitizer.supplier.entity.SupplierBankAcInfo;
import com.lara.sanitizer.supplier.service.SupplierBankAcInfoService;

@RestController
@CrossOrigin
@RequestMapping(path = "/supplierBankAcInfo")
public class SupplierBankAcInfoController {
	
	@Autowired
	private SupplierBankAcInfoService supplierBankAcInfoService;
	
	@PostMapping
	public SupplierBankAcInfo save(@RequestBody SupplierBankAcInfo supplierBankAcInfo) {
		
		return supplierBankAcInfoService.Save(supplierBankAcInfo);
	}
	
	@GetMapping
	public List<SupplierBankAcInfo> readAll()
	{
		return supplierBankAcInfoService.readAll();
	}
	
	@PutMapping
	public SupplierBankAcInfo update(@RequestBody SupplierBankAcInfo supplierBankAcInfo) {
		return supplierBankAcInfoService.update(supplierBankAcInfo);
	}
	
	@GetMapping(path = "/{id}")
	public SupplierBankAcInfo read(@PathVariable Integer id)
	{
		return supplierBankAcInfoService.read(id);
	}
	
	@DeleteMapping(path = "/{id}")
	public SupplierBankAcInfo delete(@PathVariable Integer id)
	{
		return supplierBankAcInfoService.delete(id);
	}


}
