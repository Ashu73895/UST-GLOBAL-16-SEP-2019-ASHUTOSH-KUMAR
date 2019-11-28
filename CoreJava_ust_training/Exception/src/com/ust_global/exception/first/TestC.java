package com.ust_global.exception.first;

public class TestC {
	public static void main(String[] args) {
		System.out.println("====Main Started======");
		int[] a= {10,20,30};
		int b=10;
		try {
			System.out.println(a[4]);
			
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Index is not present");
		}
		
		try {
			System.out.println(b/0);
		} catch (ArithmeticException e) {
			System.out.println("Number is divided by zero");
		}
		System.out.println("=====Main Ended=======");
	}

}
