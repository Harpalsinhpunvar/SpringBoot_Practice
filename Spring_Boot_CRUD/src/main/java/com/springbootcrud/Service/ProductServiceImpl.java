package com.springbootcrud.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootcrud.Repository.ProductRepository;
import com.springbootcrud.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	private ProductRepository productRepository;
	
	@Autowired
	public void setMyRepository(ProductRepository myRepository) {
		this.productRepository = myRepository;
	}

	@Override
	public Iterable<Product> listAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	  public Product getProductById(Integer id) {
		List<Product> list = new ArrayList<>();
        return list.stream().filter(e->e.getProductId() == id).findFirst().get();
    }

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(Integer id) {
		this.productRepository.deleteById(id);
		
	}

}
