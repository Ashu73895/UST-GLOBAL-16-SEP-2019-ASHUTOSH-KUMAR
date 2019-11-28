package com.ust_global.accessmodifiers.pkg1;

import com.ust_global.accessmodifiers.pkg2.Demo;

public class Sample extends Demo {
	public static void main(String[] args) {
		
	
	Demo d=new Demo();
	//PRIVATE
//	System.out.println(d.a);
//	d.add();
	
	//DEFAULT
	
	
//	System.out.println(d.b);
//	d.sub();
	
	Sample s=new Sample();
	//PROTECTED
	System.out.println(s.c);
	s.mul();
	
	//PUBLIC
	System.out.println(d.name);
	d.div();
	}

}
