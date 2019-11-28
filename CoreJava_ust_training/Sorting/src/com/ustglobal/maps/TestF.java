package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {
		Student s1=new Student(2,"Divya",67.89);
		Student s2=new Student(3,"Bhavya",66.89);
		Student s3=new Student(4,"Ramya",65.89);
		Student s4=new Student(5,"Kiran",69.89);
		Student s5=new Student(6,"Anjali",87.89);
		Student s6=new Student(7,"Richa",58.89);
		Student s7=new Student(8,"Tanya",30.89);
		Student s8=new Student(9,"Deepa",99.89);
		Student s9=new Student(10,"Payal",45.89);
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		ArrayList<Student> al1 = new ArrayList<>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		ArrayList<Student> al2 = new ArrayList<>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<>();
		hm.put("First", al);
		hm.put("Second", al1);
		hm.put("Third", al2);
//		System.out.println(hm);
		ArrayList<Student> first=hm.get("Second");
		Iterator<Student> it = first.iterator();
		while(it.hasNext()) {
			Student s= it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("==========================");
			
		}
		
		
	}

}
