package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {
	public static void main(String[] args) {
		ArrayList<Pen> al = new ArrayList<>();
		Pen p1 = new Pen(10,"Glycer","Blue");
		Pen p2 = new Pen(12,"PinPoint","Black");
		Pen p3 = new Pen(8,"Agni","Red");
		Pen p4 = new Pen(20,"Writometer","Green");
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		System.out.println("Before sorting");
		displayPenDetails(al);
		
		SortByPrice sb =new SortByPrice();
//		//Collections.sort(al,sb);
//		displayPenDetails(al);
		
		SortByColor sc= new SortByColor();
		Collections.sort(al,sc);
		System.out.println("  After SortByColor====");
		displayPenDetails(al);
		
		
		System.out.println("After sorting in reverse");
		Collections.sort(al);
		Collections.reverse(al);
		displayPenDetails(al);
		
		
		
		
	}
	static void displayPenDetails(ArrayList<Pen> p) {
		Iterator<Pen> it=p.iterator();
		while(it.hasNext()) {
			Pen pn=it.next();
			System.out.println("Price is "+pn.price);
			System.out.println("Brand is "+pn.brand);
			System.out.println("Color is "+pn.color);
			System.out.println("-----------------------");
		}
	}

}
