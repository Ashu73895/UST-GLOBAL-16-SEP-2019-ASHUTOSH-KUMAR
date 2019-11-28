package com.ust_global.exception.first;

public class TestG {
	public static void main(String[] args) {
		System.out.println("Main started");
		Paytm p=new Paytm();
		try {
		p.book();
		}catch(ArithmeticException ae) {
			System.out.println("Exception caught in main method");
		}finally {
			System.out.println("executed finally block");
		}
		System.out.println("Main ended");
	}

}
