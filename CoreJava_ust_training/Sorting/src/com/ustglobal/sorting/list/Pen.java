package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen> {
	double price;
	String brand;
	String color;
	public Pen(double price, String brand,String color) {
		super();
		this.price = price;
		this.brand = brand;
		this.color=color;
	}
//	@Override    //based on price
//	public int compareTo(Pen p) {
//		Double i=this.price;
//		Double j=p.price;
//		return i.compareTo(j);
//	}
	
//	@Override     //Based on brand
//	public int compareTo(Pen p) {
//		String pp= this.brand.toLowerCase();
//		String q = p.brand.toLowerCase();
//
//		
//		return pp.compareTo(q);   //compareToIgnoreCase(q)
//		
//	}

	@Override     //Based on color
	public int compareTo(Pen p) {
		String pp= this.color.toLowerCase();
		String q = p.color.toLowerCase();

		
		return pp.compareTo(q);   //compareToIgnoreCase(q)
		
	}
	

}
