package com.ust_global.exception.second;

public class TestA {
	public static void main(String[] args) {
		System.out.println("Main started");
		try {
			Thread.sleep(3000);
			System.out.println("Inside try");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception caught");
			e.printStackTrace();
		}
		System.out.println("Main ended");
	}

}
