package com.ust_global.beanobject.bean;

import java.util.Scanner;

public class TestC {
	public static void main(String[] args) {
		System.out.println("Scanner class");
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Are u male ");
		boolean b=sc.nextBoolean();
		System.out.println(b);
		
		System.out.println("Enter full name ");
		String fln = sc.nextLine();
		System.out.println("Full name is "+fln);
		sc.nextLine();
		
		System.out.println("Enter age ");
		int age = sc.nextInt();
		System.out.println("Age is "+age);
		sc.nextLine();
	
		System.out.println("Enter first name ");
		String fn =sc.next();
		System.out.println("First name is "+fn);
		sc.close();
		
		
		
	}

}
