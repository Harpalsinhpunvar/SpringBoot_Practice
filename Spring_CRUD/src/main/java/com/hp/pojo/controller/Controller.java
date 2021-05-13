package com.hp.pojo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hp.pojo.Pojo;
import com.hp.pojo.service.Service;

@RestController
public class Controller {
	
	@Autowired
	Service s;
	
	@GetMapping("/pojo")
	public List<Pojo> getPojo(){
		return this.s.getAll();
	}
	
	@GetMapping("/pojo/{id}")
	public Pojo getSingle(@PathVariable("id") int id) {
		return this.s.getById(id);
	}
	
	@PostMapping("/pojo")
	public Pojo addPojo(@RequestBody Pojo p) {
		return this.s.addPojo(p);
	}
	
	@PutMapping("/pojo/{id}")
	public void updatePojo(@RequestBody Pojo pojo, @PathVariable int id) {
		 this.s.updatePojo(pojo, id);
	}
	
	@DeleteMapping("pojo/{id}")
	public void delete(@PathVariable int id) {
		this.s.deletePojo(id);
	}

}
