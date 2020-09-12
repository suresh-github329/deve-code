package com.lara.sanitizer.supplier.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lara.sanitizer.supplier.entity.Document;
import com.lara.sanitizer.supplier.service.DocumentService;

@RestController
@CrossOrigin
@RequestMapping(path = "/documents")
public class DocumentController {
	
	@Autowired
	private DocumentService documentSrrvice;
	
	@PostMapping
	public Document save(@RequestBody Document document) {
		
		return documentSrrvice.Save(document);
	}
	
	@GetMapping
	public List<Document> readAll()
	{
		return documentSrrvice.readAll();
	}
	
	@PutMapping
	public Document update(@RequestBody Document document) {
		return documentSrrvice.update(document);
	}
	
	@GetMapping(path = "/{id}")
	public Document read(@PathVariable Integer id)
	{
		return documentSrrvice.read(id);
	}
	
	@DeleteMapping(path = "/{id}")
	public Document delete(@PathVariable Integer id)
	{
		return documentSrrvice.delete(id);
	}

}
