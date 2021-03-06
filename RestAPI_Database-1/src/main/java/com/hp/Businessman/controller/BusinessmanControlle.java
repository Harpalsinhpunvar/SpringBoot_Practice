package com.hp.Businessman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hp.Businessman.Businessman;
import com.hp.Businessman.service.BusinessmanService;

@RestController
public class BusinessmanControlle {
	
	@Autowired
	private BusinessmanService bs;
	
	@PostMapping("/addbusinessman")
	public Businessman addBm(@RequestBody Businessman businessman) {
		return bs.addBusinessman(businessman);
	}
	
	@PostMapping("/addallbusinessman")
	public List<Businessman> addBm(@RequestBody List<Businessman> businessmans) {
		return bs.addMany(businessmans);
	}
	
	@GetMapping("/getbusinessman")
	public List<Businessman> getBus(){
		return bs.getBusinessman();
	}
	
	@GetMapping("/getbusinessman/{id}")
	public Businessman getBus(@PathVariable ("id") int id){
		return bs.getByIdBusinessman(id);
	}
	
	@GetMapping("/getbusinessman/{name}")
	public Businessman getBus(@PathVariable ("name") String name){
		return bs.getByNameBusinessman(name);
	}
	
	@DeleteMapping("/deletebusinessman/{id}")
	public void deleteBusi(@PathVariable ("id") int id) {
		bs.deleteBusinessman(id);
	}
	
	@PutMapping("/updatebusinessman/{id}")
	public Businessman updatebusi(@RequestBody Businessman bmm) {
		return bs.updateBusinessman(bmm);
	}

}
