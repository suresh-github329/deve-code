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
import com.lara.sanitizer.customer.entity.OrderItems;
import com.lara.sanitizer.customer.service.OrderItemsService;

@RestController
@CrossOrigin
@RequestMapping(path = "/orderItems")
public class OrderItemController {
	
	@Autowired
	private OrderItemsService orderItemsService;
	
	@PostMapping
	public OrderItems saveOrder(@RequestBody OrderItems item) {
		return orderItemsService.saveOrder(item);	
	}
	
	@PostMapping(path  = "/saveAllItems")
	public List<OrderItems> saveAll(@RequestBody List<OrderItems> list){
		return orderItemsService.saveAllItems(list);
	}
	
	@GetMapping(path = "/{id}")
	public OrderItems readItem(@PathVariable Integer id) {
	
		return orderItemsService.readItem(id);
	}
	
	@GetMapping
	public List<OrderItems> readAllItems(){
		return orderItemsService.readAllItems();
		}
	
	@DeleteMapping(path = "/{id}")
	public OrderItems deleteItem(@PathVariable Integer id) {
		return orderItemsService.deleteItem(id);
	}
	
	@PutMapping
	public OrderItems updateOrderItems(@RequestBody OrderItems orderItems) {
		return orderItemsService.updateOrderItems(orderItems);
	}
	
	

}
