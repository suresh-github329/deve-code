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


import com.lara.sanitizer.customer.entity.OrderAddress;
import com.lara.sanitizer.customer.service.OrderAddressService;

@RestController
@CrossOrigin
@RequestMapping(path = "/orderAddress")
public class OrderAddressController {

	@Autowired
	private OrderAddressService orderAddressService;
	
	@PostMapping
	public OrderAddress save(@RequestBody OrderAddress orderAddress)
	{
		orderAddressService.save(orderAddress);
		return orderAddress;
	}
	
	@PostMapping(path = "/saveAllOrderAddress")
	public List<OrderAddress> saveAll(@RequestBody List<OrderAddress> list)
	{
		orderAddressService.saveAll(list);
		return list;
	}
	
	@GetMapping(path = "/{id}")
	public OrderAddress readOrderAddress(@PathVariable("id") Integer id)
	{
		return orderAddressService.readOrderAddress(id);
	}
	
	@GetMapping
	public List<OrderAddress> readAllOrders()
	{
		return orderAddressService.readAllOrderAddress();
	}
	
	@DeleteMapping(path = "/{id}")
	public Integer deleteOrderAddress(@PathVariable("id") Integer id)
	{
		orderAddressService.deleteOrderAddress(id);
		return id;
		
	}
	
	@PutMapping
	public OrderAddress updateOrderAddress(@RequestBody OrderAddress orderAddress) {
		return orderAddressService.updateOrderAddress(orderAddress);
	}
}
