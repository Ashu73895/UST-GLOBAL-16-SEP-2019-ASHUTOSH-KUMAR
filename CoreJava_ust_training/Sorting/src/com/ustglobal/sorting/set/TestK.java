package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestK {
	public static void main(String[] args) {
		Comparator<Employee> comp= (e1,e2)->{
			Integer i =e1.id;
			Integer j=e2.id;
			return i.compareTo(j);
		};
		TreeSet<Employee> ts = new TreeSet<>(comp);
		Employee e1 = new Employee(4,"Nikki",5.6);
		Employee e2 = new Employee(1,"Bhaskar",5.6);
		Employee e3 = new Employee(5,"Suresh",5.6);
		Employee e4 = new Employee(2,"Dinesh",5.6);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println("=============Using Iterator============= ");
		Iterator<Employee> it = ts.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Name is "+e.name);
			System.out.println("Id is "+e.id);
			System.out.println("Height is "+e.height);
			System.out.println("===========================");
		}
		}

}
