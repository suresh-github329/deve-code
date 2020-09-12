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

import com.lara.sanitizer.supplier.entity.SupplierOwner;
import com.lara.sanitizer.supplier.service.SupplierOwnerService;

@RestController
@CrossOrigin
@RequestMapping(path = "/supplierOwner")
public class SupplierOwnerController {

	@Autowired
	private SupplierOwnerService supplierOwnerService;
	

	@PostMapping
	public SupplierOwner save(@RequestBody SupplierOwner supplierOwner) {
		
		return supplierOwnerService.Save(supplierOwner);
	}
	
	@GetMapping
	public List<SupplierOwner> readAll()
	{
		return supplierOwnerService.readAll();
	}
	
	@PutMapping
	public SupplierOwner update(@RequestBody SupplierOwner supplierOwner) {
		return supplierOwnerService.update(supplierOwner);
	}
	
	@GetMapping(path = "/{id}")
	public SupplierOwner read(@PathVariable Integer id)
	{
		return supplierOwnerService.read(id);
	}
	
	@DeleteMapping(path = "/{id}")
	public SupplierOwner delete(@PathVariable Integer id)
	{
		return supplierOwnerService.delete(id);
	}
}
