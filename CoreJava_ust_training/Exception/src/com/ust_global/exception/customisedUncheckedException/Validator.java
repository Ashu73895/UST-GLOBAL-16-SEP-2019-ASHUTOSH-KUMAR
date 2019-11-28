package com.ust_global.exception.customisedUncheckedException;

public class Validator {
	void verify(int age) {
		if(age<18) {
			throw new InvalidAgeException("try again next time !!");
			
		}
	}

}
