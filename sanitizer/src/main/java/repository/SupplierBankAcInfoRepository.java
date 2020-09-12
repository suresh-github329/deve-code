package com.lara.sanitizer.supplier.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lara.sanitizer.supplier.entity.SupplierBankAcInfo;


public interface SupplierBankAcInfoRepository extends CrudRepository<SupplierBankAcInfo, Integer> {

	@Query(value="select * from supplier_bank_ac_info e where e.supplier_id=:id",nativeQuery = true)
	public List<SupplierBankAcInfo> findSupplierBankAcInfoBySupplierId(Integer id);
}
