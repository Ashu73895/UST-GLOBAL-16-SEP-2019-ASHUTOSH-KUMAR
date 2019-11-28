package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {
	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add(12);
		li.add(34.5);
		li.add("more");
		li.add(true);
		li.add(null);
		
		System.out.println("=========Using for loop===========");
		for(int i =0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
		System.out.println("======Using for each loop==========");
		for(Object o:li) {
			System.out.println(o);
		}
		
		System.out.println("==========UsingIterator========");
		
		Iterator it=li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		System.out.println("=============Using ListIterator=====");
		System.out.println("====FORWARD========");
		ListIterator lt=li.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		System.out.println("====BACKWARD=========");
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}
	}

}
