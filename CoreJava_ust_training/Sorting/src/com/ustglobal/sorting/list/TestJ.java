package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
	public static void main(String[] args) {
		SortByCusNm csn=new SortByCusNm();
		TreeSet<Customer> ts= new TreeSet<>(csn);
		Customer c1 = new Customer("Mannu",69,69000);
		Customer c2 = new Customer("Sannu",67,68000);
		Customer c3 = new Customer("Kannu",89,79000);
		Customer c4 = new Customer("Dannu",74,59000);
		Customer c5 = new Customer("Mannu",69,69000);
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		ts.add(c5);
		System.out.println("***************Using Iterator********");
		Iterator<Customer> it=ts.iterator();
		while(it.hasNext()) {
			Customer c = it.next();
			System.out.println("Name is "+c.name);
			System.out.println("Id is "+c.id);
			System.out.println("Salary is "+c.salary);
			System.out.println("==================");
		}
		
	}

}
