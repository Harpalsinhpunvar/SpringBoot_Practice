package com.hp.pojo;

public class Pojo {
	private int id;
	private String name;
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
	public Pojo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Pojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pojo [id=" + id + ", name=" + name + "]";
	}
	

}
