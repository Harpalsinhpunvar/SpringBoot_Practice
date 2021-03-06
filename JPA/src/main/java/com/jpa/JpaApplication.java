package com.jpa;



import java.util.*;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.Student.Student;
import com.jpa.Student.Repository.StudentRepository;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaApplication.class, args);
		
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		
		/* create
		Student st1 = new Student();
		st1.setName("har");
		st1.setCity("vadodara");
		
		Student st2 = new Student();
		st2.setName("raj");
		st2.setCity("Lunawada");
		
		Student st = studentRepository.save(st1);
		
		List<Student> students = List.of(st1, st2);
		Iterable<Student> result = studentRepository.saveAll(students);
		
		result.forEach(s->{
				System.out.println(s);
		});
		
		System.out.println("All Save!!!");*/
		
		
		/*update
		Optional<Student> optional = studentRepository.findById(16);
		Student s = optional.get();
		
		s.setName("Veer");
		s.setCity("Delhi");
		
		Student s1 = studentRepository.save(s);*/
		
		//read
//		Optional<Student> optional = studentRepository.findById(16);
//		Student s = optional.get();
//		System.out.println(s);
		
//		Iterable<Student> result = studentRepository.findAll();
//		result.forEach(s->System.out.println(s));
		
//		result.forEach(new Consumer<Student>() {
//
//			@Override
//			public void accept(Student t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//			
//		});
		
		
		//delete
//		studentRepository.deleteById(19);
		Iterable<Student> result = studentRepository.findAll();
		result.forEach(s->System.out.println(s));
		studentRepository.deleteAll();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
