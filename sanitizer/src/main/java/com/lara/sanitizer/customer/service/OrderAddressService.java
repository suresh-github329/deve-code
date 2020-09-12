package com.lara.sanitizer.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lara.sanitizer.customer.entity.OrderAddress;
import com.lara.sanitizer.customer.repository.OrderAddressRepository;

@Service
public class OrderAddressService {

	@Autowired
	private OrderAddressRepository orderAddressRepo;
	
	public OrderAddress save(OrderAddress orderAddress)
	{
		orderAddressRepo.save(orderAddress);
		return orderAddress;
	}
	
	public List<OrderAddress> saveAll(List<OrderAddress> list)
	{
		orderAddressRepo.saveAll(list);
		return list;
	}
	
	public OrderAddress readOrderAddress(Integer id)
	{
		OrderAddress orderAddress = orderAddressRepo.findById(id).get();
		return orderAddress;
	}
	
	public List<OrderAddress> readAllOrderAddress()
	{
		List<OrderAddress> list = (List<OrderAddress>)orderAddressRepo.findAll();
		return list;
	}
	
	public OrderAddress deleteOrderAddress(Integer id)
	{
		OrderAddress orderAddress = readOrderAddress(id);
		orderAddressRepo.deleteById(id);
		return orderAddress;
	}
	
	public OrderAddress updateOrderAddress(OrderAddress orderAddress) {
		orderAddressRepo.save(orderAddress);
		return orderAddress;
	}
	
}
