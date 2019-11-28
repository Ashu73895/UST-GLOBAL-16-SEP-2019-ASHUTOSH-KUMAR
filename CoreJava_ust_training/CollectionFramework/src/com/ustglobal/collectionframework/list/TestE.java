package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestE {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Shreya");
		
		Object o = al.get(0);
		
		System.out.println(o);
		String s=(String)o;
		System.out.println(s.toUpperCase());
		
		
	}

}
