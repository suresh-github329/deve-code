package com.lara.sanitizer.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lara.sanitizer.product.entity.Product;
import com.lara.sanitizer.product.entity.ProductType;
import com.lara.sanitizer.product.repository.ProductRepository;
import com.lara.sanitizer.product.repository.ProductTypeRepository;

@Service
public class ProductTypeService {
	
	@Autowired
	private  ProductTypeRepository productTypeRepo;
	
	@Autowired
	private ProductRepository productRepo;
	
	public ProductType saveProductType(ProductType productType) {
		productTypeRepo.save(productType);
		return 	productType;
	}
	
	public List<ProductType> readProductTypes() {
		List<ProductType> productTypes = (List<ProductType>) productTypeRepo.findAll();
		return productTypes ;
	}
	
	public ProductType readProductType(Integer id) {
		ProductType productType = productTypeRepo.findById(id).get();
		return productType;
	}
	
	public ProductType updateProductType(ProductType productType) {
		productTypeRepo.save(productType);
		return 	productType;
	}
	
	public ProductType deleteProductType(Integer id) {
		ProductType productType = productTypeRepo.findById(id).get();
		productTypeRepo.deleteById(id);
		return productType;
	}
	
	//
	public Product saveProduct(Product product) {
		productRepo.save(product);
		return 	product;
	}
	
	public List<Product> readProducts() {
		List<Product> products = (List<Product>) productRepo.findAll();
		return products ;
	}
	
	public Product readProduct(Integer id) {
		Product product = productRepo.findById(id).get();
		return product;
	}
	
	public Product updateProduct(Product product) {
		productRepo.save(product);
		return 	product;
	}
	
	public Product deleteProduct(Integer id) {
		Product product = productRepo.findById(id).get();
		productRepo.deleteById(id);
		return product;
	}

}
