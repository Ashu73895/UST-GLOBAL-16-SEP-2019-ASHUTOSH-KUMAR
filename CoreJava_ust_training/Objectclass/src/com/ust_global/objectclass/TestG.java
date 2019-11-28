package com.ust_global.objectclass;

public class TestG {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"Vikash",45000);
		Employee e2=new Employee(2,"Sumer",50000);
		Employee e3=new Employee(1,"Vikash",45000);
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println("===========================");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
	

}
