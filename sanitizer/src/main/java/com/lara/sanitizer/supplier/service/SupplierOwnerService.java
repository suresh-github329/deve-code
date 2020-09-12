package com.lara.sanitizer.supplier.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lara.sanitizer.supplier.entity.SupplierOwner;
import com.lara.sanitizer.supplier.repository.SupplierOwnerRepository;

@Service
public class SupplierOwnerService {
	
	@Autowired
	private SupplierOwnerRepository supplierOwnerRepo;
	
	public void deleteAllSupplierOwnerBySupplierId(Integer id) {
		List<SupplierOwner> supplierOwnres =supplierOwnerRepo.findSupplierOwnerBySupplierId(id);
		if(supplierOwnres !=null && supplierOwnres.size() !=0) {
			supplierOwnerRepo.deleteAll();
		}
		System.out.println("All got deleted");
	}
	
	public SupplierOwner Save(SupplierOwner supplierOwner) {
		return supplierOwnerRepo.save(supplierOwner);
	}
	
	public List<SupplierOwner> readAll(){
		List<SupplierOwner> supplierOwners=(List<SupplierOwner>) supplierOwnerRepo.findAll();
		return supplierOwners;
	}
	
	public SupplierOwner read(Integer id) {
		return supplierOwnerRepo.findById(id).get();
	}
	
	public SupplierOwner update(SupplierOwner supplierOwner) {
		return supplierOwnerRepo.save(supplierOwner);
	}
	
	public SupplierOwner delete(Integer id) {
		SupplierOwner supplierOwner=supplierOwnerRepo.findById(id).get();
		supplierOwnerRepo.deleteById(id);
		 return supplierOwner;
	}

}
