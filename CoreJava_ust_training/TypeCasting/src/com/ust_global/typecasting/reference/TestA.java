package com.ust_global.typecasting.reference;

public class TestA {
	public static void main(String[] args) {
		Pen p = new Marker();
		System.out.println(p.cost);
		p.write();
//		System.out.println(p.size);             Not Possible
//		p.color                                 Not Possible
		Marker m=(Marker)p;
		System.out.println(m.size);
		m.color();
		
	}

}
