package com.hp.service.businesslogic;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hp.repository.MyRepository;
import com.hp.simplePojo.Student;

@Component
public class MyService {
	
	@Autowired
	private MyRepository myRepository;
	
	//-----------------CREATE-------->POST
	public Student createStudent(Student s) {
		return myRepository.save(s);
	}
	
	public List<Student> saveAllStudent(List<Student> ss){
		return myRepository.saveAll(ss);
	}
	//-----------------READ---------->GET
	public List<Student> getAllStudent(){
		return myRepository.findAll();
	}
	
	public Student getByStudentId(int id) {
		return myRepository.findById(id).orElse(null);
	}
	
	public Student getByStudentName(String name) {
		return myRepository.findByName(name);
	}
	//-----------------UPDATE-------->PUT
	public Student updateStudent(Student student) {
		Student extStudent = myRepository.findById(student.getId()).orElse(null);
		extStudent.setName(student.getName());
		extStudent.setCity(student.getCity());
		extStudent.setStd(student.getStd());
		return myRepository.save(extStudent);
	}
	//-----------------DELETE-------->DELETE
	public String deleteStudent(int id) {
		myRepository.deleteById(id);
		return "Removed !!" + id;
		}

}
