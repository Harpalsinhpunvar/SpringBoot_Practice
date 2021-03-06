package com.hp.Businessman;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Businessman {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Business business;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Business getBusiness() {
		return business;
	}
	public void setBusiness(Business business) {
		this.business = business;
	}
	
	public Businessman(int id, String name, Business business ) {
		super();
		this.id = id;
		this.name = name;
		this.business = business;
	}
	public Businessman() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
