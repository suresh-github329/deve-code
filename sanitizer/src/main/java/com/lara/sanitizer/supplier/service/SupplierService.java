package com.lara.sanitizer.supplier.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lara.sanitizer.supplier.entity.Document;
import com.lara.sanitizer.supplier.entity.Supplier;
import com.lara.sanitizer.supplier.entity.SupplierBankAcInfo;
import com.lara.sanitizer.supplier.entity.SupplierCertificate;
import com.lara.sanitizer.supplier.entity.SupplierContactPerson;
import com.lara.sanitizer.supplier.entity.SupplierOwner;
import com.lara.sanitizer.supplier.repository.SupplierRepository;

@Service
public class SupplierService {

	@Autowired
	private SupplierRepository supplierRepo;
	
	@Autowired
	private SupplierOwnerService supplierOwnerServic;
	
	@Autowired 
	private SupplierContactPersonService supplierContactPersonService;
	
	@Autowired 
	private SupplierCertificateService supplierCertificateService;
	
	@Autowired
	private SupplierBankAcInfoService supplierBankAcInfoService;
	
	@Autowired
	private DocumentService documentService;
	
	public Supplier save(Supplier supplier) {
		
		
		supplier.getAddress().setSupplier(supplier);
		supplier.getLoginDetails().setSupplier(supplier);
		
		
		for(SupplierOwner so:supplier.getSupplierOwner()) {
			so.setSupplier(supplier);
		}
		
		for(SupplierContactPerson scp:supplier.getSupplierContactPerson()) {
			scp.setSupplier(supplier);
		}
		
		for(SupplierCertificate sc:supplier.getSupplierCertificate()) {
			sc.setSupplier(supplier);
		}
		
		for(SupplierBankAcInfo sbai:supplier.getSupplierBankAcInfo()) {
			sbai.setSupplier(supplier);
		}
		
		for(Document sd:supplier.getDocument()) {
			sd.setSupplier(supplier);
		}
		return supplierRepo.save(supplier);
	}
	
	public List<Supplier> readAll(){
		List<Supplier> suppliers=(List<Supplier>) supplierRepo.findAll();
		return suppliers;
	}
	
	public Supplier read(Integer id) {
		Supplier supplier=supplierRepo.findById(id).get();
		return supplier;
	}
	
	public Supplier update(Supplier supplier) {
			
		
		
		supplierOwnerServic.deleteAllSupplierOwnerBySupplierId(supplier.getId());
		supplierContactPersonService.deleteAllSupplierContactPersonBySupplierId(supplier.getId());
		supplierCertificateService.deleteAllSupplierContactPersonBySupplierId(supplier.getId());
		supplierBankAcInfoService.deleteAllSupplierContactPersonBySupplierId(supplier.getId());
		documentService.deleteDocumentBySupplierId(supplier.getId());
		
		
		for(SupplierOwner so:supplier.getSupplierOwner()) {
			so.setSupplier(supplier);
		}
		
		for(SupplierContactPerson scp:supplier.getSupplierContactPerson()) {
			scp.setSupplier(supplier);
		}
		
		for(SupplierCertificate sc:supplier.getSupplierCertificate()) {
			sc.setSupplier(supplier);
		}
		
		for(SupplierBankAcInfo sbai:supplier.getSupplierBankAcInfo()) {
			sbai.setSupplier(supplier);
		}
		
		for(Document sd:supplier.getDocument()) {
			sd.setSupplier(supplier);
		}
		return supplierRepo.save(supplier);
	}
	
	public Supplier delete(Integer id) {
		Supplier supplier=supplierRepo.findById(id).get();
		supplierRepo.deleteById(id);
		return supplier;
	}
	
}
