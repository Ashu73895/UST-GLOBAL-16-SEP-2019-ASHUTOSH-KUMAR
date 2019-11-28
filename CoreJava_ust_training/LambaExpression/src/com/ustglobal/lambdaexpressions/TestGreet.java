package com.ustglobal.lambdaexpressions;

public class TestGreet {
	public static void main(String[] args) {
		GreetInterface gi=(message)->{
			System.out.println("hello");
			System.out.println(message);
			
		      };
		gi.greet("Gud mrng");
		
	}

}
