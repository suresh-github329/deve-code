package com.lara.sanitizer.product.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lara.sanitizer.product.entity.AvailableStock;
import com.lara.sanitizer.product.entity.SupplierProductIngredient;
import com.lara.sanitizer.product.repository.AvailableStockRepository;
import com.lara.sanitizer.product.repository.SupplierProductIngredientRepository;

@Service
public class IngredientService {

	@Autowired
	private SupplierProductIngredientRepository supplierProductIngredientRepo;

	@Autowired
	private AvailableStockRepository availableStockRepo;
	
	public SupplierProductIngredient saveSupplierProductIngredient(SupplierProductIngredient supplierProductIngredient) {
		supplierProductIngredientRepo.save(supplierProductIngredient);
		return 	supplierProductIngredient;
	}
	
	public List<SupplierProductIngredient> readSupplierProductIngredients() {
		List<SupplierProductIngredient> supplierProductIngredients = (List<SupplierProductIngredient>) supplierProductIngredientRepo.findAll();
		return supplierProductIngredients ;
	}
	
	public SupplierProductIngredient readSupplierProductIngredient(Integer id) {
		SupplierProductIngredient supplierProductIngredient = supplierProductIngredientRepo.findById(id).get();
		return supplierProductIngredient;
	}
	
	public SupplierProductIngredient updateSupplierProductIngredient(SupplierProductIngredient supplierProductIngredient) {
		supplierProductIngredientRepo.save(supplierProductIngredient);
		return supplierProductIngredient;
	}
	
	public SupplierProductIngredient deleteSupplierProductIngredient(Integer id) {
		SupplierProductIngredient supplierProductIngredient = supplierProductIngredientRepo.findById(id).get();
		supplierProductIngredientRepo.deleteById(id);
		return supplierProductIngredient;
	}
	
	//
	public AvailableStock saveAvailableStock(AvailableStock availableStock) {
		availableStockRepo.save(availableStock);
		return 	availableStock;
	}
	
	public List<AvailableStock> readAvailableStocks() {
		List<AvailableStock> availableStocks = (List<AvailableStock>) availableStockRepo.findAll();
		return availableStocks ;
	}
	
	public AvailableStock readAvailableStock(Integer id) {
		AvailableStock availableStock = availableStockRepo.findById(id).get();
		return availableStock;
	}
	
	public AvailableStock updateAvailableStock(AvailableStock availableStock) {
		availableStockRepo.save(availableStock);
		return availableStock;
	}

	public AvailableStock deleteAvailableStock(Integer id) {
		AvailableStock availableStock = availableStockRepo.findById(id).get();
		availableStockRepo.deleteById(id);
		return availableStock;
	}
	
}