package com.ust_global.beanobject.bean;

public class Database1 {
	void receive(Employee e) {
		System.out.println("id is "+e.getId());
		System.out.println("salary is "+e.getSalary());
		System.out.println("name is "+e.getName());
		System.out.println("dept is "+e.getDept());
		System.out.println("designation is "+e.getDesignation());
	}

}
