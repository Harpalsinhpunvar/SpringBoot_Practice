package com.springbootcrud.Product.Repository;

import org.springframework.data.repository.CrudRepository;

import com.springbootcrud.Product.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
