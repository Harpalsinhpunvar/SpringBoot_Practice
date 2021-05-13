package com.springbootcrud;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springbootcrud.teacher.Teacher;
import com.springbootcrud.teacher.dao.ProductRepository;

@SpringBootApplication
public class SprintBootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext c = SpringApplication.run(SprintBootJpaApplication.class, args);
		
		ProductRepository pr = c.getBean(ProductRepository.class);
		
//		Teacher t1 = new Teacher();
//		t1.setName("harpalsinh");
//		t1.setAddress("Vadoadar");
//		
//		Teacher t2 = new Teacher();
//		t2.setName("Rajpalsinh");
//		t2.setAddress("Lunawada");
//		
//		List<Teacher> t = List.of(t1, t2);
//		
//		Iterable<Teacher> result = pr.saveAll(t);
//		
//		System.out.println(result);
		
//		Optional<Teacher> option = pr.findById(26);
//		Teacher t = option.get();
//		System.out.println(t);
		
//		Iterable<Teacher> t = pr.findAll();
//		
//		t.forEach(tech->System.out.println(tech));
		
//		Optional<Teacher> t = pr.findById(26);
//		Teacher tt = t.get();
//		
//		tt.setName("Jeetpat");
//		tt.setAddress("Bundelkhanl");
//		
//		Teacher t1 = pr.save(tt);
//		
//		System.out.println(t1);
		
//		pr.deleteById(27);
		pr.deleteAll();
		

		
		
	}

}
