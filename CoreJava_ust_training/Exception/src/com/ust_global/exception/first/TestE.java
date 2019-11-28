package com.ust_global.exception.first;

public class TestE {
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
			
		} catch (NullPointerException e) {
			System.out.println("Dont play with null");
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Index is not present");
			
		}catch(ArithmeticException ab){
			System.out.println("Number divided by zero error");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Ended");
		
	}

}
