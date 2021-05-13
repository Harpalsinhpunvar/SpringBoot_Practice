package com.springbootcrud.product.service;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.springbootcrud.product.Product;

@Component
public class Service {
	
	static List<Product> list = new ArrayList<>();
	
	static {
		list.add(new Product(101, "laptop"));
		list.add(new Product(102, "Mobile"));
	}
	
	//--------------------------Read (GET)
	
	//all getting
	public List<Product> getAll(){
		return list;
	}
	
	//single getting
	public Product getSingle(int id) {
		Product p=null;
		p=list.stream().filter(e->e.getId() == id).findFirst().get();
		return p;
	}
	
	//----------------------------------Create(POST)
	
	public Product addProduct(Product p) {
		list.add(p);
		return p;
	}
	
	//-------------------------------Update(PUT)
	public void updateById(Product product, int id) {
		list = list.stream().map(e->{
			if(e.getId() == id) {
				e.setName(product.getName());
			}
			return e;
		}).collect(Collectors.toList());
	}
	
	//-------------------------delete
	public void deleteProduct(int id) {
		list = list.stream().filter(e->e.getId() != id).collect(Collectors.toList());
	}
	
	

}
