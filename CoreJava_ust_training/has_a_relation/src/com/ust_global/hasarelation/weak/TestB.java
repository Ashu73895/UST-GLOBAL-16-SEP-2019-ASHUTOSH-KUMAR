package com.ust_global.hasarelation.weak;

public class TestB {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.name);
		System.out.println(c.color);
		c.ride();
	    c.m.playMusic();   //Association
	}

}
