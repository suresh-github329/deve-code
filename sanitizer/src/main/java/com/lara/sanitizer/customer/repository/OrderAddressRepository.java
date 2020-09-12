package com.lara.sanitizer.customer.repository;

import org.springframework.data.repository.CrudRepository;

import com.lara.sanitizer.customer.entity.OrderAddress;

public interface OrderAddressRepository extends CrudRepository<OrderAddress, Integer>{
	

}
