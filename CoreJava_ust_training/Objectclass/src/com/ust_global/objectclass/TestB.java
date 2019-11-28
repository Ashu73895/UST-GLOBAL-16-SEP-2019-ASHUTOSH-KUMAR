package com.ust_global.objectclass;

public class TestB {
	public static void main(String[] args) {
		Pen p = new Pen();
		int pHashcode = p.hashCode();
		System.out.println("Address of p = " + p);
		System.out.println("Hashcode of p = " + pHashcode);
		System.out.println("=============================");

		Pen q = new Pen();
		int qHashcode = q.hashCode();
		System.out.println("Address of q = " + q);
		System.out.println("Hashcode of q = " + qHashcode);

	}

}
