package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(12);
		al.add(22.5);
		al.add("Chinnu");
		al.add(true);
		al.add(null);
		al.add('A');
		
		System.out.println(al.get(2));
		
		System.out.println("=====================");
		
		for(int i=0;i<6;i++) {
			Object obj = al.get(i);
			System.out.println(obj);
		}
		
		System.out.println("=====================");
		System.out.println(al);
		
	}

}
