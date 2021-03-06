package com.hp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hp.simplePojo.Student;

public interface MyRepository extends JpaRepository<Student, Integer> {

	Student findByName(String name);
}
