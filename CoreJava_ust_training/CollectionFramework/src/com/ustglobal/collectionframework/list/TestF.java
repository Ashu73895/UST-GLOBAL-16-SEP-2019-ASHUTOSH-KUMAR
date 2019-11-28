package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {
	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("Anupama");
		al.add("Savita");
		al.add("Kavita");
		al.add("Sunitha");
		
		String st =al.get(0);
		System.out.println(st.toUpperCase());
		
		System.out.println("============Iterator==========");
		Iterator<String> li =al.iterator();
		while(li.hasNext()) {
			String s=li.next();
			System.out.println(s);
		}
		System.out.println("=======ListIterator=============");
		ListIterator<String> lit=al.listIterator();
		while(lit.hasNext()) {
			String sp=lit.next();
			System.out.println(sp);
		}
		
		System.out.println("Using for each ==============");
		for(String sb:al) {
			System.out.println(sb);
		}
		
		
	}

}
