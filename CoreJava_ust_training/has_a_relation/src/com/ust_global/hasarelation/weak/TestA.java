package com.ust_global.hasarelation.weak;

public class TestA {
	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		p.sleep();
		System.out.println(p.m.name);
		System.out.println(p.m.size);
		p.m.write();            // Association(Has-a relation)
	}

}
