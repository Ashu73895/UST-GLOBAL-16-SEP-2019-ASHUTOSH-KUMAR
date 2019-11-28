package com.ust_global.objectclass;

public class TestC {
	public static void main(String[] args) {
		Marker m = new Marker();
		int h = m.hashCode();
		String s = m.toString();
		System.out.println(m);
		System.out.println("Hashcode = " + h);
		System.out.println("toString = " + s);
	}

}
