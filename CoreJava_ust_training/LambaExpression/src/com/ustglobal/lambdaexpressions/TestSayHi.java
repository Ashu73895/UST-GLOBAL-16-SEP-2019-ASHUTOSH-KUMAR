package com.ustglobal.lambdaexpressions;

public class TestSayHi {
	public static void main(String[] args) {
		SayHi sh=()->System.out.println("hi");
		sh.sayHi();
	}

}
