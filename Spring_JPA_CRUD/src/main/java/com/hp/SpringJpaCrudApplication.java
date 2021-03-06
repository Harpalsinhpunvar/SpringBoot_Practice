package com.hp;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hp.pojo.Pojo;
import com.hp.pojo.repository.Repository;

@SpringBootApplication
public class SpringJpaCrudApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJpaCrudApplication.class, args);
		
		Repository r = context.getBean(Repository.class);
		//---------------------------------create for C
//		Pojo pojo1 = new Pojo();
//		pojo1.setName("harpalsinh");
		
//		Pojo pojo2 = new Pojo();
//		pojo2.setName("rajpalsinh");
//		
//		List<Pojo> list = List.of(pojo1, pojo2);
//		
//		Iterable<Pojo> result = r.saveAll(list);
//		
//		result.forEach(e->System.out.println(e));
		//---------------------------------create for C

		//---------------------------------read for R
//		Optional<Pojo> option = r.findById(1);
//		Pojo p = option.get();
//		System.out.println(p);
		
//		Iterable<Pojo> result = r.findAll();
//	
//		result.forEach(e->System.out.println(e));
		//---------------------------------read for R

		
		//---------------------------------update for U
//		Optional<Pojo> option = r.findById(1);
//		Pojo p = option.get();
//		
//		p.setName("Manharsinh");
//		
//		Pojo p1 = r.save(p);
//		
//		System.out.println(p1);
		//---------------------------------update for U

		//---------------------------------delete for D
//		r.deleteById(1);
//		r.deleteAll();
		//---------------------------------delete for D

	}

}
