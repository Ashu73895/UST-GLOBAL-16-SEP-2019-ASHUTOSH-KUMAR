package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Divya",30000);
		Employee e2 = new Employee(2,"Bhavya",31000);
		Employee e3 = new Employee(3,"Navya",32000);
		Employee e4 = new Employee(4,"Ramya",33000);
		Employee e5 = new Employee(5,"Richa",34000);
		Employee e6 = new Employee(6,"Deepa",43000);
		Employee e7 = new Employee(7,"Tanya",23000);
		Employee e8 = new Employee(8,"Anjali",17000);
		Employee e9 = new Employee(9,"Arpita",3000);
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		ArrayList<Employee> al1 = new ArrayList<>();
		al1.add(e4);
		al1.add(e5);
		al1.add(e6);
		
		ArrayList<Employee> al2 = new ArrayList<>();
		al2.add(e7);
		al2.add(e8);
		al2.add(e9);
		
		HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
		hm.put("Manager1", al);
		hm.put("Manager2", al1);
		hm.put("Manager3", al2);
		
		ArrayList<Employee> first=hm.get("Manager1");
		Iterator<Employee> it = first.iterator();
		System.out.println("-------------MANAGER1-------------------");
		while(it.hasNext()) {
			Employee s= it.next();
			
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.salary);
			System.out.println("==========================");
			
		}
			
			ArrayList<Employee> second=hm.get("Manager2");
			Iterator<Employee> it1 = second.iterator();
			System.out.println("-------------MANAGER2-------------------");
			while(it1.hasNext()) {
				Employee s1= it1.next();
				
				System.out.println("Id is "+s1.id);
				System.out.println("Name is "+s1.name);
				System.out.println("Percentage is "+s1.salary);
				System.out.println("==========================");
				
			}
				
				ArrayList<Employee> third=hm.get("Manager3");
				Iterator<Employee> it2 = third.iterator();
				System.out.println("-------------MANAGER3-------------------");
				while(it2.hasNext()) {
					Employee s2= it2.next();
					
					System.out.println("Id is "+s2.id);
					System.out.println("Name is "+s2.name);
					System.out.println("Percentage is "+s2.salary);
					System.out.println("==========================");
					
				}
					
				
			
		}
		
	}

		
