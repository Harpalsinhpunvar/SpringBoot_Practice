package com.springbootcrud.Repository;

import org.springframework.data.repository.CrudRepository;

import com.springbootcrud.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
