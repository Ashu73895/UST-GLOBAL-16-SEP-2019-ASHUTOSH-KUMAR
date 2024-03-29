package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestK {
	public static void main(String[] args) {
		ArrayList<Double> al= new ArrayList<Double>();
		al.add(34.5);
		al.add(23.5);
		al.add(87.6);
		al.add(12.3);
		al.add(34.5);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		
		al.add(2, 54.6);
		System.out.println("After adding in 2nd index "+al);
		al.remove(0);
		System.out.println("After removing 0th index "+al);
        al.remove(null);
        System.out.println("After removing null "+al);
        Double val = al.get(4);
        System.out.println("Object at 4th index "+val);
        al.set(2, 77.6);
        System.out.println("After replacing 2nd index "+al);
        al.clear();
        System.out.println("After clear method "+al);
        al.contains(54.6);
        
        List<Double> al1 = new ArrayList<>();
        al1.add(12.3);
        al1.add(23.4);
        al1.add(34.5);
        al.addAll(al1);
        
        System.out.println("After add all "+al);
        
      boolean contain = al.containsAll(al1);
      System.out.println("Contains all : "+contain);
        
        
        boolean res=al.removeAll(al1);
        System.out.println("Removed all of al1 : "+res);
        
        System.out.println("After remove "+al);
	}

}
