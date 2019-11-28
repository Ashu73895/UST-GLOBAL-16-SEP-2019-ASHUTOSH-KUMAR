package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop>{
	double price;
	int ram;
	String name;
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}
//	@Override
//	public int compareTo(Laptop l) {
//		Integer i=this.ram;
//		Integer j=l.ram;
//		return i.compareTo(j);
//		
//	}
	
//	@Override
//	public int compareTo(Laptop l) {
//		Double i=this.price;
//		Double j=l.price;
//		return i.compareTo(j);
//		
//	}
	@Override     //Based on name
	public int compareTo(Laptop l) {
		String p= this.name.toLowerCase();
		String q = l.name.toLowerCase();
//		String pp =p.toLowerCase();
//		String qq=q.toLowerCase();
		
		return p.compareTo(q);   //compareToIgnoreCase(q)
		
	}
	
	

}
