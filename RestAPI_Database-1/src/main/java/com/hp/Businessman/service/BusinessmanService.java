package com.hp.Businessman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hp.Businessman.Businessman;
import com.hp.Businessman.repository.BusinessmanRepository;

@Component
public class BusinessmanService {
	
	@Autowired
	private BusinessmanRepository br;
	
	public Businessman addBusinessman(Businessman bm) {
		return br.save(bm);
	}
	
	public List<Businessman> addMany(List<Businessman> bms){
		return br.saveAll(bms);
	}
	
	public List<Businessman> getBusinessman() {
		return br.findAll();
	}
	
	public Businessman getByIdBusinessman(int id) {
		return br.findById(id).orElse(null);
	}
	
	public Businessman getByNameBusinessman(String name) {
		return br.findByName(name);
	}
	
	public void deleteBusinessman(int id) {
		br.deleteById(id);
	}
	public Businessman updateBusinessman(Businessman businessman) {
		Businessman extBusinessman = br.findById(businessman.getId()).orElse(null);
		extBusinessman.setName(businessman.getName());
		return extBusinessman;
	}

}
