package com.springbootcrud.teacher.dao;

import org.springframework.data.repository.CrudRepository;

import com.springbootcrud.teacher.Teacher;

public interface ProductRepository extends CrudRepository<Teacher, Integer> {

}
