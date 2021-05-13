package com.hp.Businessman;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Business {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int businessId;
	private String name;
	private String type;
	
	public int getBusinessId() {
		return businessId;
	}
	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Business(int businessId, String name, String type) {
		super();
		this.businessId = businessId;
		this.name = name;
		this.type = type;
	}
	public Business() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
