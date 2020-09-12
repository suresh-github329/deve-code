package com.lara.sanitizer.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
import com.lara.sanitizer.supplier.entity.Supplier;
import com.lara.sanitizer.supplier.repository.SupplierRepository;


@Service
public class SupplierProductService {
	
	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private SupplierRepository supplierRepo;
	
	@Autowired
	private ManufacturerRepository manufaturerRepo;
	
	@Autowired
	private OffersRepository offersRepo;
	
	@Autowired
	private ReviewsRatingsRepository reviewsRatingsRepo;
	
	@Autowired
	private RefundRepository refundRepo;
	
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
	
	//
	public Supplier saveSupplier(Supplier supplier) {
		supplierRepo.save(supplier);
		return supplier;
	}
	
	public List<Supplier> readSuppliers() {
		List<Supplier> suppliers = (List<Supplier>) supplierRepo.findAll();
		return suppliers ;
	}
	
	public Supplier readSupplier(Integer id) {
		Supplier supplier = supplierRepo.findById(id).get();
		return supplier;
	}
	
	public Supplier updateSupplier(Supplier supplier) {
		supplierRepo.save(supplier);
		return 	supplier;
	}
	
	public Supplier deleteSupplier(Integer id) {
		Supplier supplier = supplierRepo.findById(id).get();
		supplierRepo.deleteById(id);
		return supplier;
	}
	
	//
	public Manufacturer saveManufacturer(Manufacturer manufacturer) {
		manufaturerRepo.save(manufacturer);
		return manufacturer;
	}
	
	public List<Manufacturer> readManufacturers() {
		List<Manufacturer> manufacturers = (List<Manufacturer>) manufaturerRepo.findAll();
		return manufacturers ;
	}
	
	public Manufacturer readManufacturer(Integer id) {
		Manufacturer manufacturer = manufaturerRepo.findById(id).get();
		return manufacturer;
	}
	
	public Manufacturer updateManufacturer(Manufacturer manufacturer) {
		manufaturerRepo.save(manufacturer);
		return 	manufacturer;
	}
	
	public Manufacturer deleteManufacturer(Integer id) {
		Manufacturer manufacturer = manufaturerRepo.findById(id).get();
		manufaturerRepo.deleteById(id);
		return manufacturer;
	}
	
	//
	public Offers saveOffers(Offers offers) {
		offersRepo.save(offers);
		return offers;
	}
	
	public List<Offers> readOffers() {
		List<Offers> offers = (List<Offers>) offersRepo.findAll();
		return offers ;
	}
	
	public Offers readOffer(Integer id) {
		Offers offer = offersRepo.findById(id).get();
		return offer;
	}
	
	public Offers updateOffers(Offers offers) {
		offersRepo.save(offers);
		return 	offers;
	}
	
	public Offers deleteOffer(Integer id) {
		Offers offer = offersRepo.findById(id).get();
		offersRepo.deleteById(id);
		return offer;
	}
	
	//
	public ReviewsRatings saveReviewsRatings(ReviewsRatings reviewsRatings) {
		reviewsRatingsRepo.save(reviewsRatings);
		return reviewsRatings;
	}
	
	public List<ReviewsRatings> readReviewsRatings() {
		List<ReviewsRatings> reviewsRatings = (List<ReviewsRatings>) reviewsRatingsRepo.findAll();
		return reviewsRatings ;
	}
	
	public ReviewsRatings readReviewsRating(Integer id) {
		ReviewsRatings reviewsRating = reviewsRatingsRepo.findById(id).get();
		return reviewsRating;
	}
	
	public ReviewsRatings updateReviewsRatings(ReviewsRatings reviewsRatings) {
		reviewsRatingsRepo.save(reviewsRatings);
		return 	reviewsRatings;
	}
	
	public ReviewsRatings deleteReviewsRating(Integer id) {
		ReviewsRatings reviewsRating = reviewsRatingsRepo.findById(id).get();
		reviewsRatingsRepo.deleteById(id);
		return reviewsRating;
	}
	
	//
	public Refund saveRefund(Refund refund) {
		refundRepo.save(refund);
		return refund;
	}
	
	public List<Refund> readRefunds() {
		List<Refund> refunds = (List<Refund>) refundRepo.findAll();
		return refunds ;
	}
	
	public Refund readRefund(Integer id) {
		Refund refund = refundRepo.findById(id).get();
		return refund;
	}
	
	public Refund updateRefund(Refund refund) {
		refundRepo.save(refund);
		return 	refund;
	}
	
	public Refund deleteRefund(Integer id) {
		Refund refund = refundRepo.findById(id).get();
		refundRepo.deleteById(id);
		return refund;
	}

}
