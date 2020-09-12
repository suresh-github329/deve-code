package com.lara.sanitizer.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lara.sanitizer.customer.entity.OrderItems;
import com.lara.sanitizer.customer.repository.OrderItemsRepository;

@Service
public class OrderItemsService {
	
	@Autowired
	private OrderItemsRepository orderItemsRepo;
	
	public OrderItems saveOrder(OrderItems item) {
		orderItemsRepo.save(item);
		return item;
	}
	
	public List<OrderItems> saveAllItems(List<OrderItems> list){
		orderItemsRepo.saveAll(list);
		return list;
	}
	
	public OrderItems readItem(Integer id) {
		OrderItems orderItem=orderItemsRepo.findById(id).get();
		return orderItem;
	}
	
	public List<OrderItems> readAllItems(){
		List<OrderItems> list=(List<OrderItems>)orderItemsRepo.findAll();
		return list;
	}
	
	public OrderItems deleteItem(Integer id) {
		OrderItems orderItem=readItem(id);
		orderItemsRepo.deleteById(id);
		return orderItem;
	}
	
	public OrderItems updateOrderItems(OrderItems orderItem ) {
		orderItemsRepo.save(orderItem);
		return orderItem;
	}

}


