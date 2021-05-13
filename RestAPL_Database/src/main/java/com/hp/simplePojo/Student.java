package com.hp.simplePojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Portal")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Student_id")
	private int id;
	
	@Column(name="Student_name")
	private String name;
	
	@Column(name="Student_city")
	private String city;
	
	@Column(name="Student_std")
	private int std;
	
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
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getStd() {
		return std;
	}
	
	public void setStd(int std) {
		this.std = std;
	}
	
	public Student(int id, String name, String city, int std) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.std = std;
	}
	public Student() {
		super();
	}
}
