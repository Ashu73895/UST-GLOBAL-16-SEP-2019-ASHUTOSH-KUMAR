package com.ustglobal.sorting.list;

public class Student implements Comparable<Student> {
	int id;
	String name;
	double percentage;
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
//	@Override  //Based on id
//	public int compareTo(Student s) {
//		if(this.id>s.id) {
//			return 1;
//		}else if(this.id<s.id) {
//			return -1;
//		}
//		else {
//		return 0;
//		}
//	}
//	@Override  //Based on percenatge
//	public int compareTo(Student s) {
//		if(this.percentage>s.percentage) {
//			return 1;
//		}else if(this.percentage<s.percentage) {
//			return -1;
//		}
//		else {
//		return 0;
//		}
//	}
	@Override     //Based on name
	public int compareTo(Student s) {
		String p= this.name.toLowerCase();
		String q = s.name.toLowerCase();
//		String pp =p.toLowerCase();
//		String qq=q.toLowerCase();
		
		return p.compareTo(q);   //compareToIgnoreCase(q)
		
	}
	
	// public int compareTo(Student s){
//	  Integer i = this.id;
//	  Integer j=s.id;
//	  return i.compareTo(j);
//}




}
