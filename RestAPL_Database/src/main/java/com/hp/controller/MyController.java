package com.hp.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hp.service.businesslogic.MyService;
import com.hp.simplePojo.Student;

@RestController
public class MyController {
	
	@Autowired
	private MyService myService;
	
	//---------------CREATE----------------------
	@PostMapping("/addstudent")
	public Student saveStudent(@RequestBody Student student){
		return myService.createStudent(student);
	}
	
	@PostMapping("/addallstudent")
	public List<Student> createAllStudent(@RequestBody List<Student> students){
		return myService.saveAllStudent(students);
	}
	//---------------GET/READ----------------------
	@GetMapping("/getstudent")
	public List<Student> getStudent(){
		return myService.getAllStudent();
	}
	
	@GetMapping("/getbyidstudnet/{id}")
	public Student getById(@PathVariable ("id") int id) {
		return myService.getByStudentId(id);
	}
	
	@GetMapping("/getbynamestudent/{name}")
	public Student getByStd(@PathVariable ("name") String name) {
		return myService.getByStudentName(name);
	}
	//---------------UPDATE----------------------
	@PutMapping("/updatestudent/{id}")
	public Student updateStudent(@RequestBody Student student) {
		return myService.updateStudent(student);
	}
	//---------------DELETE----------------------
	@DeleteMapping("/deletestudent/{id}")
	public String deleteStudent(@PathVariable ("id") int id) {
		return myService.deleteStudent(id);
	}
}
