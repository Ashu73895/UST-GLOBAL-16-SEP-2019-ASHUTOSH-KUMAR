package com.ust_global.beanobject.bean;

public class Student {
	private int id;
	
	private String name;
	private int rollno;
	
	public Student() {}           //Default Constructor
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	public int getRollno() {
		return rollno;
	}

}
