package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
public static void main(String[] args) {
	SortByName sn=new SortByName();
	SortByPincode sp = new SortByPincode();
	SortByMicr sm = new SortByMicr();
	TreeSet<Bank> ts=new TreeSet<>(sn);
	Bank b1=new Bank("HDFC",560076,676878897);
	Bank b2=new Bank("SBI",560071,676887897);
	Bank b3=new Bank("CITI",560070,676879997);
	Bank b4=new Bank("CANARA",560069,676678897);
	Bank b5=new Bank("CANARA",560069,676678897);
	
	ts.add(b1);
	ts.add(b2);
	ts.add(b3);
	ts.add(b4);
	ts.add(b5);
	
	
	System.out.println("***********Using iterator**********");
	Iterator<Bank> it = ts.iterator();
	while(it.hasNext()) {
		Bank b = it.next();
		System.out.println("Name is "+b.name);
		System.out.println("Pincode is "+b.pincode);
		System.out.println("Micr code is "+b.micr);
		System.out.println("================================");
	}
	
	
}
}
