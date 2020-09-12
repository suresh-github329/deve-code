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


import com.lara.sanitizer.supplier.entity.SupplierContactPerson;
import com.lara.sanitizer.supplier.service.SupplierContactPersonService;

@RestController
@CrossOrigin
@RequestMapping(path = "/supplierContactPerson")
public class SupplierContactPersonController {
	
	@Autowired
	private SupplierContactPersonService supplierContactPersonService;
	
	
	@PostMapping
	public SupplierContactPerson save(@RequestBody SupplierContactPerson supplierContactPerson) {
		
		return supplierContactPersonService.Save(supplierContactPerson);
	}
	
	@GetMapping
	public List<SupplierContactPerson> readAll()
	{
		return supplierContactPersonService.readAll();
	}
	
	@PutMapping
	public SupplierContactPerson update(@RequestBody SupplierContactPerson supplierContactPerson) {
		return supplierContactPersonService.update(supplierContactPerson);
	}
	
	@GetMapping(path = "/{id}")
	public SupplierContactPerson read(@PathVariable Integer id)
	{
		return supplierContactPersonService.read(id);
	}
	
	@DeleteMapping(path = "/{id}")
	public SupplierContactPerson delete(@PathVariable Integer id)
	{
		return supplierContactPersonService.delete(id);
	}


}
