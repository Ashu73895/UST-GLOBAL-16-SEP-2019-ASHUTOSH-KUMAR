package com.ust_global.objectclass;

public class TestD {
	public static void main(String[] args) {
		Student s1 = new Student(10, "Ranga", 45.77);
		int h = s1.hashCode();
		System.out.println(h);
		//s1.printDetails();
		System.out.println(s1);
	}

}
