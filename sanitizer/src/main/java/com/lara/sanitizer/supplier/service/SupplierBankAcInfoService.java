package com.lara.sanitizer.supplier.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lara.sanitizer.supplier.entity.SupplierBankAcInfo;
import com.lara.sanitizer.supplier.repository.SupplierBankAcInfoRepository;

@Service
public class SupplierBankAcInfoService {
	
	@Autowired
	private SupplierBankAcInfoRepository supplierBankAcInfoRepo;;
	
	public void deleteAllSupplierContactPersonBySupplierId(Integer id) {
		List<SupplierBankAcInfo> supplierBankAcInfos =supplierBankAcInfoRepo.findSupplierBankAcInfoBySupplierId(id);
		if(supplierBankAcInfos !=null && supplierBankAcInfos.size() !=0) {
			supplierBankAcInfoRepo.deleteAll();
		}
		System.out.println("All got deleted");
	}
	
	
	public SupplierBankAcInfo Save(SupplierBankAcInfo supplierBankAcInfo) {
		return supplierBankAcInfoRepo.save(supplierBankAcInfo);
	}
	
	public List<SupplierBankAcInfo> readAll(){
		List<SupplierBankAcInfo> supplierBankAcInfos=(List<SupplierBankAcInfo>) supplierBankAcInfoRepo.findAll();
		return supplierBankAcInfos;
	}
	
	public SupplierBankAcInfo read(Integer id) {
		return supplierBankAcInfoRepo.findById(id).get();
	}
	
	public SupplierBankAcInfo update(SupplierBankAcInfo supplierBankAcInfo) {
		return supplierBankAcInfoRepo.save(supplierBankAcInfo);
	}
	
	public SupplierBankAcInfo delete(Integer id) {
		SupplierBankAcInfo supplierBankAcInfo=supplierBankAcInfoRepo.findById(id).get();
		supplierBankAcInfoRepo.deleteById(id);
		 return supplierBankAcInfo;
	}

}
