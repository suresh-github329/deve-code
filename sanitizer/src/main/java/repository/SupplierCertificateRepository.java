package com.lara.sanitizer.supplier.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lara.sanitizer.supplier.entity.SupplierCertificate;


public interface SupplierCertificateRepository extends CrudRepository<SupplierCertificate, Integer> {

	@Query(value="select * from supplier_certificate e where e.supplier_id=:id",nativeQuery = true)
	public List<SupplierCertificate> findSupplierCertificateBySupplierId(Integer id);
}
