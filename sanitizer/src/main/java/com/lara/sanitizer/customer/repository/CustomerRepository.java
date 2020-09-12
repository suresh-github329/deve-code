package com.lara.sanitizer.customer.repository;

import org.springframework.data.repository.CrudRepository;

import com.lara.sanitizer.customer.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
