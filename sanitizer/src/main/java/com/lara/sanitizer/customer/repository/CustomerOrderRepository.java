package com.lara.sanitizer.customer.repository;

import org.springframework.data.repository.CrudRepository;

import com.lara.sanitizer.customer.entity.CustomerOrder;

public interface CustomerOrderRepository extends CrudRepository<CustomerOrder,Integer>{

}
