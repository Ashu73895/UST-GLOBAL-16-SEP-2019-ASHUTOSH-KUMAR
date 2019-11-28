package com.ust_global.beanobject.bean;

public class DataBase {
	void receive(Student s) {
		System.out.println("Id is "+s.getId());
		System.out.println("Name is "+s.getName());
		System.out.println("Rollno is "+s.getRollno());
	}
	
	void save(Employee e) {
		System.out.println("-----------I am Database--------");
		System.out.println("Id is "+e.getId());
		System.out.println("Name is "+e.getName());
		System.out.println("Salary is "+e.getSalary());
		
	}
}
