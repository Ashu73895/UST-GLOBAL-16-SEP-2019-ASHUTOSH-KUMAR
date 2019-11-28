package com.ust_global.typecasting.primitive;

public class TestA {
	public static void main(String[] args) {
		byte a=10;
		int b=a;     //Implicit casting
		System.out.println("b is "+b);
		int p=20;
		double q=p;
		System.out.println("q is "+q);
		System.out.println("=====================");
		
		double d = 97.14;
		int e=(int)d;            //Explicit Casting
		System.out.println("e is "+e);
		byte z = (byte)e;
		System.out.println(" z is "+z);
		char r=(char)z;
		System.out.println(" r is "+r);
		
	}

}
