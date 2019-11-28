package com.ustglobal.immutable;

public class TestString {
	public static void main(String[] args) {
		MyString ms = new MyString(12,"Divya");
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
		System.out.println(ms);
		System.out.println("============================");
		MyString ms1=ms.changeContent(13, "Anu");
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
		System.out.println("============================");
		System.out.println(ms1.getName());
		System.out.println(ms1.getRollno());
		System.out.println(ms1);
	}

}
