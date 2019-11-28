package com.ust_global.google;

public class TestA {
	public static void main(String[] args) {
		Browser b=new Browser();
		Gmail g = new Gmail();
		GoogleDrive gd = new GoogleDrive();
		b.open(g);
		b.open(gd);
	}

}
