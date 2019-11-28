package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		HashMap hm =new HashMap<>();
		hm.put("Kuku",998014);
		hm.put("Mala", 678941);
		hm.put("Sheela", 9875445);
		System.out.println("Data"+hm);
		hm.put("Mala", 7898987);
		System.out.println("After modify "+hm);
		hm.put("Dimple", 7898987);
		System.out.println("After dimple "+hm);
		hm.put(null, 123456);
		hm.put(null, 654321);
		System.out.println("After null "+hm);
		
		System.out.println(hm.get("Sheela"));	
		System.out.println(hm.get("Shala"));
		System.out.println("============================");
		
		System.out.println(hm.remove("Kuku"));
		System.out.println("After removing kuku "+hm);
		
	}
	

}
