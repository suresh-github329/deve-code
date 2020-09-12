package com.lara.sanitizer.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lara.sanitizer.product.entity.AvailableStock;
import com.lara.sanitizer.product.entity.SupplierProductIngredient;
import com.lara.sanitizer.product.service.IngredientService;

@RestController
@CrossOrigin
public class IngredientController {
	
	@Autowired
	private IngredientService ingredientService;
	
	@RequestMapping(path = "/saveSupplierProductIngredient", method = RequestMethod.POST)
	public SupplierProductIngredient saveSupplierProductIngredient(@RequestBody SupplierProductIngredient supplierProductIngredient) {
		return ingredientService.saveSupplierProductIngredient(supplierProductIngredient);
	}
	
	@RequestMapping(path = "/readSupplierProductIngredients", method = RequestMethod.GET)
	public  List<SupplierProductIngredient> readSupplierProductIngredients() {
		return ingredientService.readSupplierProductIngredients();
	}
	
	@RequestMapping(path = "/readSupplierProductIngredient/{id}", method = RequestMethod.GET)
	public  SupplierProductIngredient readSupplierProductIngredient(@PathVariable("id") Integer id) {
		return ingredientService.readSupplierProductIngredient(id);
	}
	
	@RequestMapping(path = "/updateSupplierProductIngredient", method = RequestMethod.PUT)
	public SupplierProductIngredient updateSupplierProductIngredient(@RequestBody SupplierProductIngredient supplierProductIngredient) {
		return ingredientService.updateSupplierProductIngredient(supplierProductIngredient);
	}
	
	@RequestMapping(path = "/deleteSupplierProductIngredient/{id}", method = RequestMethod.DELETE)
	public SupplierProductIngredient deleteSupplierProductIngredient(@PathVariable("id") Integer id) {
		return ingredientService.deleteSupplierProductIngredient(id);
	}
	
	//
	@RequestMapping(path = "/saveAvailableStock",method = RequestMethod.POST)
	public AvailableStock saveAvailableStock(@RequestBody AvailableStock availableStock) {
		return ingredientService.saveAvailableStock(availableStock);
	}
	
	@RequestMapping(path="/readAvailableStocks", method=RequestMethod.GET)
	public List<AvailableStock> readAvailableStocks()
	{
		return ingredientService.readAvailableStocks();
	}

	@RequestMapping(path="/readAvailableStock/{id}", method=RequestMethod.GET)
	public AvailableStock readAvailableStock(@PathVariable ("id") Integer id)
	{
		return ingredientService.readAvailableStock(id);
	}
	
	@RequestMapping(path = "/updateAvailableStock", method = RequestMethod.PUT)
	public AvailableStock updateAvailableStock(@RequestBody AvailableStock availableStock) {
		return ingredientService.updateAvailableStock(availableStock);
	}

	@RequestMapping(path="/deleteAvailableStock/{id}", method=RequestMethod.DELETE)
	public AvailableStock deleteAvailableStock(@PathVariable ("id") Integer id)
	{
		return ingredientService.deleteAvailableStock(id);
	}
	
	
}
