package com.ust_global.beanobject.bean;

public class TestA {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(12);
		s.setName("Shivagami");
		s.setRollno(101);
		
		DataBase d = new DataBase();
		d.receive(s);
		
		Employee e = new Employee();
		e.setId(111);
		e.setName("Alia");
		e.setSalary(1000);
		
		d.save(e);
	}

}
