package com.lara.sanitizer.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.lara.sanitizer.product.entity.Product;
import com.lara.sanitizer.product.entity.ProductType;
import com.lara.sanitizer.product.repository.ProductRepository;
import com.lara.sanitizer.product.repository.ProductTypeRepository;
import com.lara.sanitizer.product.service.ProductTypeService;

@RestController
@CrossOrigin
public class ProductTypeController {
	
	@Autowired
	private ProductTypeService productTypeService;
	
	@RequestMapping(path = "/saveProductType",method = RequestMethod.POST)
	public ProductType saveProductType(@RequestBody ProductType productType) {
		return productTypeService.saveProductType(productType);
	}
	
	@RequestMapping(path="/readProductTypes", method=RequestMethod.GET)
	public List<ProductType> readProductTypes()
	{
		return productTypeService.readProductTypes();
	}

	@RequestMapping(path="/readProductType/{id}", method=RequestMethod.GET)
	public ProductType readProductType(@PathVariable ("id") Integer id)
	{
		return productTypeService.readProductType(id);
	}
	
	@RequestMapping(path = "/updateProductType",method = RequestMethod.PUT)
	public ProductType updateProductType(@RequestBody ProductType productType) {
		return productTypeService.updateProductType(productType);
	}

	@RequestMapping(path="/deleteProductType/{id}", method=RequestMethod.DELETE)
	public ProductType deleteProductType(@PathVariable ("id") Integer id)
	{
		return productTypeService.deleteProductType(id);
	}
	
	//
	@RequestMapping(path = "/saveProduct",method = RequestMethod.POST)
	public Product saveProduct(@RequestBody Product product) {
		return productTypeService.saveProduct(product);
	}
	
	@RequestMapping(path="/readProducts", method=RequestMethod.GET)
	public List<Product> readProducts()
	{
		return productTypeService.readProducts();
	}

	@RequestMapping(path="/readProduct/{id}", method=RequestMethod.GET)
	public Product readProduct(@PathVariable ("id") Integer id)
	{
		return productTypeService.readProduct(id);
	}
	
	@RequestMapping(path = "/updateProduct",method = RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) {
		return productTypeService.updateProduct(product);
	}

	@RequestMapping(path="/deleteProduct/{id}", method=RequestMethod.DELETE)
	public Product deleteProduct(@PathVariable ("id") Integer id)
	{
		return productTypeService.deleteProduct(id);
	}
	
}
