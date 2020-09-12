package com.lara.sanitizer.supplier.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lara.sanitizer.supplier.entity.SupplierContactPerson;
import com.lara.sanitizer.supplier.repository.SupplierContactPersonRepository;


@Service
public class SupplierContactPersonService {

	@Autowired
	private SupplierContactPersonRepository supplierContactPersonRepo;
	
	public void deleteAllSupplierContactPersonBySupplierId(Integer id) {
		List<SupplierContactPerson> supplierContactPersons =supplierContactPersonRepo.findSupplierContactPersonBySupplierId(id);
		if(supplierContactPersons !=null && supplierContactPersons.size() !=0) {
			supplierContactPersonRepo.deleteAll();
		}
		System.out.println("All got deleted");
	}
	
	public SupplierContactPerson Save(SupplierContactPerson supplierContactPerson) {
		return supplierContactPersonRepo.save(supplierContactPerson);
	}
	
	public List<SupplierContactPerson> readAll(){
		List<SupplierContactPerson> supplierContactPersons=(List<SupplierContactPerson>) supplierContactPersonRepo.findAll();
		return supplierContactPersons;
	}
	
	public SupplierContactPerson read(Integer id) {
		return supplierContactPersonRepo.findById(id).get();
	}
	
	public SupplierContactPerson update(SupplierContactPerson supplierContactPerson) {
		return supplierContactPersonRepo.save(supplierContactPerson);
	}
	
	public SupplierContactPerson delete(Integer id) {
		SupplierContactPerson supplierContactPerson=supplierContactPersonRepo.findById(id).get();
		supplierContactPersonRepo.deleteById(id);
		 return supplierContactPerson;
	}
}
