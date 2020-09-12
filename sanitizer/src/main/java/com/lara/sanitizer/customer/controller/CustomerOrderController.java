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
import com.lara.sanitizer.customer.entity.CustomerOrder;
import com.lara.sanitizer.customer.service.CustomerOrderService;

@RestController
@CrossOrigin
@RequestMapping(path = "/customerOrder")
public class CustomerOrderController {

	@Autowired
	private CustomerOrderService customerOrderService;
	
	@PostMapping
	public CustomerOrder save(@RequestBody CustomerOrder order)
	{
		customerOrderService.save(order);
		return order;
	}
	
	@PostMapping(path ="/saveAllOrders")
	public List<CustomerOrder> saveAll(@RequestBody List<CustomerOrder> list)
	{
		customerOrderService.saveAll(list);
		return list;
	}
	
	@GetMapping(path = "/{id}")
	public CustomerOrder readOrder(@PathVariable("id") Integer id)
	{
		return customerOrderService.readCustomerOrder(id);
	}
	
	@GetMapping
	public List<CustomerOrder> readOrders()
	{
		return customerOrderService.readAllOrders();
	}
	
	@DeleteMapping(path = "/{id}")
	public Integer deleteCustomerOrder(@PathVariable("id") Integer id)
	{
		customerOrderService.deleteCustomerOrder(id);
		return id;		
	}
	
	@PutMapping
	public CustomerOrder updateOrder(@RequestBody CustomerOrder customerOrder) {
		return customerOrderService.updateCustomerOrder(customerOrder);
	}
}
