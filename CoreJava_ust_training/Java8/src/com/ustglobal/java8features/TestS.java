package com.ustglobal.java8features;

import java.awt.DisplayMode;
import java.util.ArrayList;

public class TestS {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(5,"Vikram",56.7));
		al.add(new Student(6,"Akram",37.7));
		al.add(new Student(7,"Bakkram",58.7));
		al.add(new Student(8,"Dikram",29.7));
		al.add(new Student(4,"Gikram",46.7));
		
		System.out.println("==============ALL STUDENTS====================");
		Helper h = new Helper();
		h.displayAllStudent(al);
		System.out.println();
		System.out.println("==== FAILED STUDENTS ===================");
		
		h.displayFailStudents(al);
		
		System.out.println();
		System.out.println("============PASSED STUDENTS===============");
		h.displayPassedStudents(al);
		
		System.out.println();
		System.out.println("===TOPPER======");
		h.displayTopper(al);
		
	}

}
