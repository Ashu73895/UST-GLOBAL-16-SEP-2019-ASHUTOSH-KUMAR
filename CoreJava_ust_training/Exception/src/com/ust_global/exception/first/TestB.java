package com.ust_global.exception.first;

public class TestB {
	public static void main(String[] args) {
		System.out.println("Main started");
		int a=10;
		int b=6;
		try {
			b=10/0;
			System.out.println(b);
			System.out.println("Hello");
			System.out.println("Happy diwali");
		}catch (ArithmeticException ae) {
             System.out.println("Number is divided by zero");
		}
		
		System.out.println(b);
		System.out.println("Main ended");
	}

}
