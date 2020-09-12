package com.lara.sanitizer.customer.controller;

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

import com.lara.sanitizer.customer.entity.Customer;
import com.lara.sanitizer.customer.service.CustomerService;

@RestController
@CrossOrigin
@RequestMapping(path = "/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping
	public Customer save(@RequestBody Customer customer)
	{
		customerService.save(customer);
		return customer;
	}
	
	@PostMapping(path = "/saveAll")
	public List<Customer> saveAll(@RequestBody List<Customer> list)
	{
		customerService.saveAll(list);
		return list;
	}
	
	@GetMapping(path ="/{id}")
	public Customer readCustomer(@PathVariable("id") Integer id)
	{
		return customerService.readCustomer(id);
	}
	
	@GetMapping
	public List<Customer> readCustomers()
	{
		return customerService.readAllCustomers();
	}
	
	@DeleteMapping(path = "/{id}")
	public Integer deleteCustomer(@PathVariable("id") Integer id)
	{
		customerService.deleteCustomer(id);
		return id;		
	}
	
	@PutMapping
	public Customer update(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}

}
