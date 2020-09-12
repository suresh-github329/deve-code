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

import com.lara.sanitizer.supplier.entity.Supplier;
import com.lara.sanitizer.supplier.service.SupplierService;

@RestController
@CrossOrigin
@RequestMapping(path = "/supplier")
public class SupplierController {
	
	@Autowired
	private SupplierService supplierService;
	
	@PostMapping
	public Supplier save(@RequestBody Supplier supplier) {
		
		return supplierService.save(supplier);
	}
	
	@GetMapping
	public List<Supplier> readAll()
	{
		return supplierService.readAll();
	}
	
	@PutMapping
	public Supplier update(@RequestBody Supplier supplier) {
		return supplierService.update(supplier);
	}
	
	@GetMapping(path = "/{id}")
	public Supplier read(@PathVariable Integer id)
	{
		return supplierService.read(id);
	}
	
	@DeleteMapping(path = "/{id}")
	public Supplier delete(@PathVariable Integer id)
	{
		return supplierService.delete(id);
	}
	
}
