package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestL {
	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<>();
		l.add(12);
		l.add(13);
		l.add(34);
		l.add(3);
		l.add(10);
		System.out.println("Before sorting ");
		System.out.println(l);
		System.out.println("After sort ");
		
		Collections.sort(l);
		System.out.println(l);
		
		System.out.println("After reverse ");
		Collections.reverse(l);
		System.out.println(l);
		
		System.out.println("Aftr shuffle ");
		Collections.shuffle(l);
		System.out.println(l);
		
	}

}
