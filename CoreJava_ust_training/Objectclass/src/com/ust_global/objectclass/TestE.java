package com.ust_global.objectclass;

public class TestE {
	public static void main(String[] args) {
		Car c1 = new Car(300000,"Alto","Black");
		Car c2 = new Car(400000,"Swift","Blue");
		Car c3 = new Car(500000,"I20","Red");
		
		int h=c1.hashCode();
		System.out.println("Cost is "+h);
		
		int h1=c2.hashCode();
		System.out.println("Cost is "+h1);
		
		int h2=c3.hashCode();
		System.out.println("Cost is "+h2);
		System.out.println("================================");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
