package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestJ {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(101,"Ankita",45.55);
		Student s2 = new Student(123,"Salman",67.88);
		Student s3 = new Student(143,"SRK",98.99);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println("========for loop============");
		for(int i=0;i<al.size();i++) {
			Student s = al.get(i);
			System.out.println(s);
//			System.out.println("Id is "+s.id);
//			System.out.println("Name is "+s.name);
//			System.out.println("Percentage is "+s.percentage);
		}
		System.out.println("=========for each===========");
		for(Student s:al) {
			System.out.println(s);
//			System.out.println("Id is "+s.id);
//			System.out.println("Name is "+s.name);
//			System.out.println("Percentage is "+s.percentage);
		}
	}

}
