package com.ust_global.Arrays;

public class TestA {
	public static void main(String[] args) {
		
	
	int[] nums=new int[5];
	nums[0]=20;
	nums[1]=30;
	nums[2]=40;
	nums[3]=50;
	nums[4]=60;
	System.out.println("=========int array======");
	for (int i = 0; i < nums.length; i++) {
		System.out.print(nums[i]+" ");
	}
	System.out.println();
	System.out.println("============double array========");
	
	double[] percs= {22,23,24,25};
	for (int i = 0; i < percs.length; i++) 
	{
		System.out.print(percs[i]+" ");
		
	}
	System.out.println();
	
	for(double i:percs) {
		System.out.print(i+" ");
	}
	System.out.println();
	System.out.println("=======byte array===========");
	
	byte[] by= {1,2,3,4,5};
	for (int i = 0; i < by.length; i++) {
		System.out.print(by[i]+" ");
	}
	System.out.println();
	for(byte b:by) {
		System.out.print(b+" ");
	}
	System.out.println();
	System.out.println("===========String array===========");
	String[] names = {"Aishu","Kavya","Divya","Anu"};
	for (int i = 0; i< names.length; i++) {
		System.out.print(names[i]+" ");
		
	}
	System.out.println();
	for (String st : names) {
		System.out.print(st+" ");
	}
	
	
	}
}
