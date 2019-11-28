package com.ust_global.exception.first;

public class TestH {
	public static void main(String[] args) {
		System.out.println("Main Started");
		String s = "hello";
		int[] a= {10,20,30};
		int b=10;
		try {
			String s1=s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);
		}catch(ArithmeticException|NullPointerException|ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
			System.out.println("main ended");
		}
	}
}
