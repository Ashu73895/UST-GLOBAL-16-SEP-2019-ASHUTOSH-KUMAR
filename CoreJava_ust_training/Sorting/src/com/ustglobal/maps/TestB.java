package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		HashMap hm = new HashMap<>();
		hm.put("Kuku", 998014);
		hm.put("Mala", 678941);
		hm.put("Sheela", 9875445);

		HashMap hm1 = new HashMap<>();
		hm1.put("Deepa", 788778);
		hm1.put("Riya", 678909);
		hm1.put("Kriti", 467787);
		System.out.println("=================================");
		System.out.println("contains key : "+hm.containsKey("Mala"));
		System.out.println("contains value : "+hm.containsValue(998014));
		
		System.out.println("Before put all "+hm);
		hm.putAll(hm1);
		System.out.println("After put all "+hm);
		System.out.println("====================================");
		System.out.println("size of hm : "+hm.size());
		System.out.println("Map is empty : "+hm.isEmpty());
		System.out.println("=====================================");
		hm.clear();
		System.out.println("After clear : "+hm);
		System.out.println("size of hm : "+hm.size());

	}

}
