package com.lara.sanitizer.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lara.sanitizer.customer.entity.Customer;
import com.lara.sanitizer.customer.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	public Customer save(Customer customer)
	{
		customerRepo.save(customer);
		return customer;
	}
	
	public List<Customer> saveAll(List<Customer> list)
	{
		customerRepo.saveAll(list);
		return list;
	}
	
	public Customer readCustomer(Integer id)
	{
		Customer customer = customerRepo.findById(id).get();
		return customer;
	}
	
	public List<Customer> readAllCustomers()
	{
		List<Customer> list = (List<Customer>)customerRepo.findAll();
		return list;
	}
	
	public Customer deleteCustomer(Integer id)
	{
		Customer customer = readCustomer(id);
		customerRepo.deleteById(id);
		return customer;
	}
	
	public Customer updateCustomer(Customer customer) {
		customerRepo.save(customer);
		return customer;
	}

}
