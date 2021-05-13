package com.springbootcrud.Product.Service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.springbootcrud.Product.Product;

@Service
public class ProductService {
	
	List<Product> list =new ArrayList<>();
	
	//-----------------------------------post
	public List<Product> addProduct(Product p){
		list.add(p);
		return list;
	}
	
	//-------------------------------------get
	public List<Product> getProduct(){
		return list;
	}
	
	
	public Product getProductById(int id){
		Product product = null;
		product = list.stream().filter(e->e.getId() == id).findFirst().get();
		return product;
	}

}
