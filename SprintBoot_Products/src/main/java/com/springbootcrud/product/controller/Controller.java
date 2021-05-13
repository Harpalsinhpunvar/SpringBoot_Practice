package com.springbootcrud.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootcrud.product.Product;
import com.springbootcrud.product.service.Service;

@RestController
public class Controller {
	
	@Autowired
	Service s;
	
	@GetMapping("/product")
	public List<Product> getAll(){
		return this.s.getAll();
	}
	
	@GetMapping("/product/{id}")
	public Product getById(@PathVariable ("id") int id) {
		return this.s.getSingle(id);
	}
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product p) {
		return this.s.addProduct(p);
	}
	
	@PutMapping("/product/{id}")
	public void updateProduct(@RequestBody Product p, @PathVariable int id) {
		this.s.updateById(p, id);
	}
	
	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable("id") int id) {
		this.s.deleteProduct(id);
	}

}
