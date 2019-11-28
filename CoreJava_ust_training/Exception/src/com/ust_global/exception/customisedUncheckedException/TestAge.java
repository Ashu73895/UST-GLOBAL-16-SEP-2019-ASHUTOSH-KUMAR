package com.ust_global.exception.customisedUncheckedException;

public class TestAge {
	public static void main(String[] args) {
		System.out.println("Main started");
		Validator v = new Validator();
		try {
		v.verify(12);
		}catch(InvalidAgeException ie) {
			System.out.println("Exception occurred");
		}
		v.verify(13);
		System.out.println("Main ended");
	}

}
