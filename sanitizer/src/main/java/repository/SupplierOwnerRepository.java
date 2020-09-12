package com.lara.sanitizer.supplier.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lara.sanitizer.supplier.entity.SupplierOwner;

public interface SupplierOwnerRepository extends CrudRepository<SupplierOwner, Integer> {

	@Query(value="select * from supplier_owner e where e.supplier_id=:id",nativeQuery = true)
	public List<SupplierOwner> findSupplierOwnerBySupplierId(Integer id);
	
}
