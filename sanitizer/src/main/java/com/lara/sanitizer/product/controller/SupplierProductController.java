package com.lara.sanitizer.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lara.sanitizer.product.entity.Manufacturer;
import com.lara.sanitizer.product.entity.Offers;
import com.lara.sanitizer.product.entity.Product;
import com.lara.sanitizer.product.entity.Refund;
import com.lara.sanitizer.product.entity.ReviewsRatings;
import com.lara.sanitizer.product.repository.ManufacturerRepository;
import com.lara.sanitizer.product.repository.OffersRepository;
import com.lara.sanitizer.product.repository.ProductRepository;
import com.lara.sanitizer.product.repository.RefundRepository;
import com.lara.sanitizer.product.repository.ReviewsRatingsRepository;

import com.lara.sanitizer.product.service.SupplierProductService;
import com.lara.sanitizer.supplier.entity.Supplier;

@RestController
@CrossOrigin
public class SupplierProductController {
	
	@Autowired
	private SupplierProductService supplierProductService;
	/*
	@RequestMapping(path = "/saveProduct",method = RequestMethod.POST)
	public Product saveProduct(@RequestBody Product product) {
		return supplierProductService.saveProduct(product);
	}
	
	@RequestMapping(path="/readProducts", method=RequestMethod.GET)
	public List<Product> readProducts()
	{
		return supplierProductService.readProducts();
	}

	@RequestMapping(path="/readProduct/{id}", method=RequestMethod.GET)
	public Product readProduct(@PathVariable ("id") Integer id)
	{
		return supplierProductService.readProduct(id);
	}
	
	@RequestMapping(path = "/updateProduct",method = RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) {
		return supplierProductService.updateProduct(product);
	}

	@RequestMapping(path="/deleteProduct/{id}", method=RequestMethod.DELETE)
	public Product deleteProduct(@PathVariable ("id") Integer id)
	{
		return supplierProductService.deleteProduct(id);
	}
	*/
	
	//
	@RequestMapping(path = "/saveSupplier",method = RequestMethod.POST)
	public Supplier saveSupplier(@RequestBody Supplier supplier) {
		return supplierProductService.saveSupplier(supplier);
	}
	
	@RequestMapping(path="/readSuppliers", method=RequestMethod.GET)
	public List<Supplier> readSuppliers()
	{
		return supplierProductService.readSuppliers();
	}

	@RequestMapping(path="/readSupplier/{id}", method=RequestMethod.GET)
	public Supplier readSupplier(@PathVariable ("id") Integer id)
	{
		return supplierProductService.readSupplier(id);
	}
	
	@RequestMapping(path = "/updateSupplier",method = RequestMethod.PUT)
	public Supplier updateSupplier(@RequestBody Supplier supplier) {
		return supplierProductService.updateSupplier(supplier);
	}

	@RequestMapping(path="/deleteSupplier/{id}", method=RequestMethod.DELETE)
	public Supplier deleteSupplier(@PathVariable ("id") Integer id)
	{
		return supplierProductService.deleteSupplier(id);
	}
	
	//
	@RequestMapping(path = "/saveManufacturer",method = RequestMethod.POST)
	public Manufacturer saveManufacturer(@RequestBody Manufacturer manufacturer) {
		return supplierProductService.saveManufacturer(manufacturer);
	}
	
	@RequestMapping(path="/readManufacturers", method=RequestMethod.GET)
	public List<Manufacturer> readManufacturers()
	{
		return supplierProductService.readManufacturers();
	}

	@RequestMapping(path="/readManufacturer/{id}", method=RequestMethod.GET)
	public Manufacturer readManufacturer(@PathVariable ("id") Integer id)
	{
		return supplierProductService.readManufacturer(id);
	}
	
	@RequestMapping(path = "/updateManufacturer",method = RequestMethod.PUT)
	public Manufacturer updateManufacturer(@RequestBody Manufacturer manufacturer) {
		return supplierProductService.updateManufacturer(manufacturer);
	}

	@RequestMapping(path="/deleteManufacturer/{id}", method=RequestMethod.DELETE)
	public Manufacturer deleteManufacturer(@PathVariable ("id") Integer id)
	{
		return supplierProductService.deleteManufacturer(id);
	}
	
	//
	@RequestMapping(path = "/saveOffers",method = RequestMethod.POST)
	public Offers saveOffers(@RequestBody Offers offers) {
		return supplierProductService.saveOffers(offers);
	}
	
	@RequestMapping(path="/readOffers", method=RequestMethod.GET)
	public List<Offers> readOffers()
	{
		return supplierProductService.readOffers();
	}

	@RequestMapping(path="/readOffer/{id}", method=RequestMethod.GET)
	public Offers readOffer(@PathVariable ("id") Integer id)
	{
		return supplierProductService.readOffer(id);
	}
	
	@RequestMapping(path = "/updateOffers",method = RequestMethod.PUT)
	public Offers updateOffers(@RequestBody Offers offers) {
		return supplierProductService.updateOffers(offers);
	}

	@RequestMapping(path="/deleteOffer/{id}", method=RequestMethod.DELETE)
	public Offers deleteOffer(@PathVariable ("id") Integer id)
	{
		return supplierProductService.deleteOffer(id);
	}
	
	//
	@RequestMapping(path = "/saveReviewsRatings",method = RequestMethod.POST)
	public ReviewsRatings saveReviewsRatings(@RequestBody ReviewsRatings reviewsRatings) {
		return supplierProductService.saveReviewsRatings(reviewsRatings);
	}
	
	@RequestMapping(path="/readReviewsRatings", method=RequestMethod.GET)
	public List<ReviewsRatings> readReviewsRatings()
	{
		return supplierProductService.readReviewsRatings();
	}

	@RequestMapping(path="/readReviewsRating/{id}", method=RequestMethod.GET)
	public ReviewsRatings readReviewsRating(@PathVariable ("id") Integer id)
	{
		return supplierProductService.readReviewsRating(id);
	}
	
	@RequestMapping(path = "/updateReviewsRatings",method = RequestMethod.PUT)
	public ReviewsRatings updateReviewsRatings(@RequestBody ReviewsRatings reviewsRatings) {
		return supplierProductService.updateReviewsRatings(reviewsRatings);
	}

	@RequestMapping(path="/deleteReviewsRating/{id}", method=RequestMethod.DELETE)
	public ReviewsRatings deleteReviewsRating(@PathVariable ("id") Integer id)
	{
		return supplierProductService.deleteReviewsRating(id);
	}
	
	//
	@RequestMapping(path = "/saveRefund",method = RequestMethod.POST)
	public Refund saveRefund(@RequestBody Refund refund) {
		return supplierProductService.saveRefund(refund);
	}
	
	@RequestMapping(path="/readRefunds", method=RequestMethod.GET)
	public List<Refund> readRefunds()
	{
		return supplierProductService.readRefunds();
	}

	@RequestMapping(path="/readRefund/{id}", method=RequestMethod.GET)
	public Refund readRefund(@PathVariable ("id") Integer id)
	{
		return supplierProductService.readRefund(id);
	}
	
	@RequestMapping(path = "/updateRefund",method = RequestMethod.POST)
	public Refund updateRefund(@RequestBody Refund refund) {
		return supplierProductService.updateRefund(refund);
	}

	@RequestMapping(path="/deleteRefund/{id}", method=RequestMethod.DELETE)
	public Refund deleteRefund(@PathVariable ("id") Integer id)
	{
		return supplierProductService.deleteRefund(id);
	}
	
}
 