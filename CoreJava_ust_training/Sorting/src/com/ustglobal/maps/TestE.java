package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
	public static void main(String[] args) {
		TreeMap<String, Integer> lh = new TreeMap<>();
		lh.put("Bangalore", 560068);
		lh.put("Haryana", 134203);
		lh.put("Patna", 888000);
//		lh.put(null, 12345);                    cannot have other than generics
//		lh.put(null,56789);
		System.out.println(lh);
		
		for (Map.Entry<String, Integer> string : lh.entrySet()) {
			String key = string.getKey();
			Integer value = string.getValue();
			System.out.println("Key is "+key);
			System.out.println("Value is "+value);
			System.out.println("===============================");
		}
	}

}
