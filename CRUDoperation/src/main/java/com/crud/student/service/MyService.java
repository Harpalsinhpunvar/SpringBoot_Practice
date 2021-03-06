package com.crud.student.service;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.crud.student.Student;

@Component
public class MyService {
	
	static List<Student> list = new ArrayList<>();
	
	static {
		list.add(new Student(101, "Harpalsinh", "Vadodara"));
		list.add(new Student(102, "Rajpalsinh", "Vadodara"));
		list.add(new Student(103, "Yashpalsinh", "Vadodara"));
		list.add(new Student(104, "Krushnapalsinh", "Vadodara"));
		list.add(new Student(105, "Kirpalsinh", "Vadodara"));
		list.add(new Student(106, "Pratipalsinh", "Vadodara"));
		list.add(new Student(107, "Kumarpalsinh", "Vadodara"));
		list.add(new Student(108, "Vishwpalsinh", "Vadodara"));
		list.add(new Student(109, "Veerpalsinh", "Vadodara"));
		list.add(new Student(110, "Yogpalsinh", "Vadodara"));
	}
	
	//READ --------------------------------------get all
	public List<Student> getAll(){
		return list;
	}
	//READ --------------------------------------get single
	public Student getSingle(int id) {
		Student student = null;
		student = list.stream().filter(e->e.getId() == id).findFirst().get();
		return student;
	}
	
	//POST --------------------------------------create
	public Student addStudent(Student stu){
		list.add(stu);
		return stu;
	}
	
	//delete--------------------------------------remove
	public void deleteStudent(int id) {
		list = list.stream().filter(e->e.getId() != id).collect(Collectors.toList()); 
	}
	
	//update----------------------------------------update
	public void updateStudent(Student student, int id) {
		list = list.stream().map(e->{
			if(e.getId() == id) {
				e.setName(student.getName());
				e.setAddress(student.getAddress());
			} return e;
		}).collect(Collectors.toList());
	}
	

}
