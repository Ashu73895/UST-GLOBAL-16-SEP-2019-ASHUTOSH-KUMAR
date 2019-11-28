package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		LinkedHashSet<Double> ls = new LinkedHashSet<>();
		ls.add(12.3);
		ls.add(45.6);
		ls.add(9.4);
		ls.add(45.6);
		ls.add(3.4);
		System.out.println("***************Using for each******");
		for (Double object : ls) {
			System.out.println(object);
			
		}
		System.out.println();
		System.out.println("****Using Iterator***********");
		Iterator<Double> it = ls.iterator();
		while(it.hasNext()) {
			Double op=it.next();
			System.out.println(op);
		}
	}

}
