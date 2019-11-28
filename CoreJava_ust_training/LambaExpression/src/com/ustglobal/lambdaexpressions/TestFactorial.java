package com.ustglobal.lambdaexpressions;

public class TestFactorial {
	public static void main(String[] args) {
		FactorialInterface fi=(int x)->{
			int fact=1;
			for(int i=1;i<=x;i++)
			{
				fact=fact*i;
			}
			return fact;
		};
		int res=fi.fact(5);
		System.out.println(res);
	}

}
