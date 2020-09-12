package com.lara.sanitizer.customer.repository;

import org.springframework.data.repository.CrudRepository;

import com.lara.sanitizer.customer.entity.OrderItems;

public interface OrderItemsRepository extends CrudRepository<OrderItems, Integer>{

}
