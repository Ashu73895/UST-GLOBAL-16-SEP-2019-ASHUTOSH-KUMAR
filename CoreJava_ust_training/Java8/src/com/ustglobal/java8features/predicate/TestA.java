package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {
		Predicate<Employee> p=s->{
			if(s.salary>20000) {
				return true;
			}else {
				return false;
			}
		};
		
		Employee e1=new Employee(10,"Keerti",30000);
		boolean res=p.test(e1);
		System.out.println("Salary >20000 : "+res);
	}

}
