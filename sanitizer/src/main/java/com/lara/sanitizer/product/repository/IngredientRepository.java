package com.lara.sanitizer.product.repository;

import org.springframework.data.repository.CrudRepository;

import com.lara.sanitizer.product.entity.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer>{

}
