package com.ust_global.accessmodifiers.pkg2;

public class Run {
	public static void main(String[] args) {
		Demo d=new Demo();
		//PRIVATE
//		System.out.println(d.a);
//		d.add();
		
		//DEFAULT
		System.out.println(d.b);
		d.sub();
		
		//PROTECTED
		System.out.println(d.c);
		d.mul();
		
		//PUBLIC
		System.out.println(d.name);
		d.div();
	}

}
