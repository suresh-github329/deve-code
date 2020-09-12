package com.lara.sanitizer.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lara.sanitizer.customer.entity.CustomerOrder;
import com.lara.sanitizer.customer.repository.CustomerOrderRepository;

@Service
public class CustomerOrderService {
	
	@Autowired
	private CustomerOrderRepository customerOrderRepo;

	public CustomerOrder save(CustomerOrder customerOrder)
	{
		customerOrderRepo.save(customerOrder);
		return customerOrder;
	}
	
	public List<CustomerOrder> saveAll(List<CustomerOrder> list)
	{
		customerOrderRepo.saveAll(list);
		return list;
	}
	
	public CustomerOrder readCustomerOrder(Integer id)
	{
		CustomerOrder customerOrder = customerOrderRepo.findById(id).get();
		return customerOrder;
	}
	
	public List<CustomerOrder> readAllOrders()
	{
		List<CustomerOrder> list = (List<CustomerOrder>)customerOrderRepo.findAll();
		return list;
	}
	
	public CustomerOrder deleteCustomerOrder(Integer id)
	{
		CustomerOrder customerOrder = readCustomerOrder(id);
		customerOrderRepo.deleteById(id);
		return customerOrder;
	}
	
	public CustomerOrder updateCustomerOrder(CustomerOrder customerOrder) {
		customerOrderRepo.save(customerOrder);
		return customerOrder;
	}
	
	
}
