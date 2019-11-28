package com.ust_global.objectclass;

public class TestH {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person(1, "Ajay");
		System.out.println("p1 id : "+p1.id);
		System.out.println("p1 name : "+p1.name);
		
		Object o=p1.clone();
		Person p2=(Person)o;
		
		System.out.println("=======AFTER CLONING================");
		p2.id=2;
		p2.name="Ayush";
		System.out.println("p1 id : "+p1.id);
		System.out.println("p1 name : "+p1.name);
		System.out.println("p2 id : "+p2.id);
		System.out.println("p2 name : "+p2.name);
	}

}
