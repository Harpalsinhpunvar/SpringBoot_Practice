package com.crud.student.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.student.Student;
import com.crud.student.service.MyService;

@RestController
public class MainController {
	
	@Autowired
	MyService s;
	
	@GetMapping("/student")
	public List<Student> getAll(){
		return this.s.getAll();
	}
	
	@GetMapping("/student/{id}")
	public Student getById(@PathVariable ("id") int id) {
		return this.s.getSingle(id);
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student){
		return this.s.addStudent(student);
	}
	
	@DeleteMapping("/student/{id}")
	public void deleteStudent(@PathVariable("id") int id) {
		this.s.deleteStudent(id);
	}
	
	@PutMapping("/student/{id}")
	public void updateStudent(@RequestBody Student student, @PathVariable ("id") int id) {
		this.s.updateStudent(student, id);
	}

}
