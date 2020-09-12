package com.lara.sanitizer.supplier.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lara.sanitizer.supplier.entity.SupplierContactPerson;

public interface SupplierContactPersonRepository extends CrudRepository<SupplierContactPerson, Integer> {

	@Query(value="select * from supplier_contact_person e where e.supplier_id=:id",nativeQuery = true)
	public List<SupplierContactPerson> findSupplierContactPersonBySupplierId(Integer id);
}
