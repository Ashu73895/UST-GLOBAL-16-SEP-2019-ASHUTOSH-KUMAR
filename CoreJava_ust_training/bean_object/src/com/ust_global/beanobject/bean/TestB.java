package com.ust_global.beanobject.bean;

public class TestB {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(5);
		e.setSalary(25000);
		e.setName("Rahul");
		e.setDept("Development");
		e.setDesignation("Developer");
		
		Database1 db =new Database1();
		db.receive(e);
		
	}

}
