package com.springbootcrud.Service;

import com.springbootcrud.entities.Product;

public interface ProductService {
	
	Iterable<Product> listAllProducts();
	
	Product getProductById(Integer id);
	
	Product saveProduct(Product product);
	
	void deleteProduct(Integer id);

}
