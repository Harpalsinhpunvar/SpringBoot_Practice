package com.jpa.Student.Repository;

import org.springframework.data.repository.CrudRepository;

import com.jpa.Student.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
