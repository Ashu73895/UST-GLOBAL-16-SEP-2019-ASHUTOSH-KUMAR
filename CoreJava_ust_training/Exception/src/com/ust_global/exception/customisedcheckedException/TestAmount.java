package com.ust_global.exception.customisedcheckedException;

public class TestAmount {
	public static void main(String[] args) {
		System.out.println("Main started");
		 ValidateAmount va = new ValidateAmount();
		 try {
			va.checkAmount(50000);
			System.out.println("Withdraw your cash");
		} catch (InvalidAmountException e) {
			
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("Main ended");
	}

}
