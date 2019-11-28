package com.ust_global.exception.first;

public class PVR {
	void bookk() {
		try {
		System.out.println("Booking started");
		System.out.println(6/0);
		System.out.println("Logic");
		System.out.println("Booking confirmed");
		}catch(ArithmeticException ae) {
			System.out.println("Exception occurred");
			throw ae;
		}
		
	}

}
