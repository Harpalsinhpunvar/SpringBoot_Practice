package com.hp.pojo.service;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.hp.pojo.Pojo;

@Component
public class Service {
	
	static List<Pojo> list = new ArrayList<>();
	
	static {
		list.add(new Pojo(101, "Nareshbhai")); 
		list.add(new Pojo(102, "Rameshbhai")); 
		list.add(new Pojo(103, "Sureshbhai")); 
	}
	
	//GET-------------------------------------------------read
	public List<Pojo> getAll(){
		return list;
	}
	
	public Pojo getById(int id) {
		Pojo pojo = null;
		pojo = list.stream().filter(e->e.getId() == id).findFirst().get();
		return pojo;
	}
	
	//Post-------------------------------------------------create
	public Pojo addPojo(Pojo p) {
		list.add(p);
		return p;
	}
	
	//Put-------------------------------------------------update
	public void updatePojo(Pojo pojo, int id) {
		list = list.stream().map(e->{
			if(e.getId() == id) {
				e.setName(pojo.getName());
			} return e;
		}).collect(Collectors.toList());
	}
	
	//Delete-------------------------------------------------delete
	public void deletePojo(int id) {
		list = list.stream().filter(e->e.getId() != id).collect(Collectors.toList());
	}
	
	

}
