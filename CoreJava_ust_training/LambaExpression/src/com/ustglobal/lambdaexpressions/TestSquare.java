package com.ustglobal.lambdaexpressions;

public class TestSquare {
	public static void main(String[] args) {
		SquareInterface si = (x)->System.out.println(x*x);
		si.square(4);
	}

}
