package com.ust_global.exception.first;

public class BMS {
	public static void main(String[] args) {
		System.out.println("bms started");
		
		PVR p= new PVR();
		try {
			p.bookk();
			System.out.println("Booking confirmed");
		}catch(ArithmeticException ae) {
			System.out.println("Booking failed");
		}
		System.out.println("bms ended");
	}

}
