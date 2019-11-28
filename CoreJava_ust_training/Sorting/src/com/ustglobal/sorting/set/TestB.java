package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		hs.add("Vijay");
		hs.add("Ajay");
		hs.add("Sujay");
		hs.add("Drijay");
		hs.add("Enjoy");
		
		
		System.out.println("*********Using For each***********************");
		for (String string : hs) {
			System.out.println(string);
			
		}
		
		System.out.println();
		System.out.println("***************Using iterator***********");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			String p =it.next();
			System.out.println(p);
			
		}
		
	}

}
