package com.example.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Empjss {
	@Id
	private  int id;
	private  String name;
	private  String dept ;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Empjss [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	

	
}
