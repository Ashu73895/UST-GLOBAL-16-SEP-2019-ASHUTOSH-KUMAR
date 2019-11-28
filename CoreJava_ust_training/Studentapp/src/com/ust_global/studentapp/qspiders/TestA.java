package com.ust_global.studentapp.qspiders;

import com.ust_global.studentapp.jspiders.*;

public class TestA {
	
	public static void main(String[] args) {
		QTP q=new QTP();
		q.teachQTP();
		Selenium s = new Selenium();
		s.teachSelenium();
		
		
		Angular a =new Angular();
		
		a.teachAngular();
		
		
		React r = new React();
		r.teachReact();
	}

}
