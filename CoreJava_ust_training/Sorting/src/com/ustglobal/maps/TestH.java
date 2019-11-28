package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(1011, "Divya");
		ht.put(102, "Bhavya");
		ht.put(103, "Navya");
		ht.put(1054, "Tanya");
		ht.put(1305, "Diya");
		ht.put(105, "Tiya");
		ht.put(1206, "Tiya");
//		ht.put(null, "Johny"); Null pointer exception
//		ht.put(109, null);     NullPointerException
		
		
		System.out.println("Data "+ht);
	}

}
