package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(23);
		al.add(98.7);
		al.add(true);
		al.add("Good Evening");
		
		Iterator it=al.iterator();
		Object ob1=it.next();
		System.out.println("obj1 = "+ob1);
		
		Object ob2=it.next();
		System.out.println("obj2 = "+ob2);
		
		Object ob3=it.next();
		System.out.println("obj3 = "+ob3);
		
		Object ob4=it.next();
		System.out.println("obj4 = "+ob4);
		
		boolean b=it.hasNext();
		System.out.println("Has next : "+b);

//	Object ob5=it.next();
//		System.out.println("obj5 = "+ob5);
		//NoSuchElementException
		
		
		
		System.out.println("=========Using for loop==============");
		for(int i=0;i<al.size();i++) {
			Object o= al.get(i);
			System.out.println(o);
		}
		
		System.out.println("========================");
		System.out.println(al);
		System.out.println("========================");
		
		ArrayList al1=new ArrayList();
		al1.add(12);
		al1.add(233.44);
		al1.add("momo");
		al1.add(false);
		
		System.out.println("==========Using Iterator=============");
		Iterator ii=al1.iterator();
		while(ii.hasNext()) {
			Object op = ii.next();
			System.out.println(op);
		}
		
	}

}
