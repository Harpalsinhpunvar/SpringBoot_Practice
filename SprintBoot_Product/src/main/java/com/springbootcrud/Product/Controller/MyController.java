package com.springbootcrud.Product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootcrud.Product.Product;
import com.springbootcrud.Product.Service.ProductService;

@RestController
public class MyController {
	
	@Autowired
	ProductService ps;
	
	//-------------------------------------------------POST
	@PostMapping("/product")
	public List<Product> addProduct(@RequestBody Product p){
		return this.ps.addProduct(p);
	}
	
	//----------------------------------------------get
	@GetMapping("/product")
	public List<Product> getProduct(){
		return this.ps.getProduct();
	}

}
