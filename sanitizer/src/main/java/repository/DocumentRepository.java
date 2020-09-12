package com.lara.sanitizer.supplier.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lara.sanitizer.supplier.entity.Document;


public interface DocumentRepository extends CrudRepository<Document, Integer> {

	@Query(value="select * from document e where e.supplier_id=:id",nativeQuery = true)
	public List<Document> findDocumentBySupplierId(Integer id);

}
