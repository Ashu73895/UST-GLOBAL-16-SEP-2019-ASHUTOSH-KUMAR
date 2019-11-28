package com.ustglobal.java8features;

import java.util.function.Function;

public class TestC {
	public static void main(String[] args) {
		Function<Integer, Integer> f=i->i*i;
		
		Integer res=f.apply(14);
		System.out.println("Square of 14 is "+res);
	}

}
