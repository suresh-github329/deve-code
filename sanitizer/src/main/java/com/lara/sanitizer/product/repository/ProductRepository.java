package com.lara.sanitizer.product.repository;

import org.springframework.data.repository.CrudRepository;

import com.lara.sanitizer.product.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
