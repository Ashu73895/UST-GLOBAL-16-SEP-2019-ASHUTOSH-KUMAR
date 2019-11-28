package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(24);
		ls.add(3.4);
		ls.add("Kavya");
		ls.add("Bhavya");
		ls.add(null);
		ls.add(null);
		System.out.println("***************Using for each******");
		for (Object object : ls) {
			System.out.println(object);
			
		}
		System.out.println();
		System.out.println("****Using Iterator***********");
		Iterator it = ls.iterator();
		while(it.hasNext()) {
			Object op=it.next();
			System.out.println(op);
		}
		
	}

}
