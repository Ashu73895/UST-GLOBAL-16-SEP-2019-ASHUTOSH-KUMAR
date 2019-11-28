package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(56);
		ts.add(34);
		ts.add(58);
		ts.add(39);
		ts.add(40);
		
		System.out.println("********** Using for each************");
		for (Object object : ts) {
			System.out.println(object);
		}
		System.out.println();
		System.out.println("*********** Using iterator*********");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
