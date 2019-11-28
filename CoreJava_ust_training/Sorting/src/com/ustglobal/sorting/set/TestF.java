package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Roopa");
		ts.add("Jaya");
		ts.add("Sushma");
		ts.add("Munni");
		ts.add("Sheela");
		
		System.out.println("*******Using foreach***********");
		for (String string : ts) {
			System.out.println(string);
			
		}
		
		System.out.println();
		System.out.println("*************Using iterator***********");
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
