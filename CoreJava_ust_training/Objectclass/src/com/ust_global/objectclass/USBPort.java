package com.ust_global.objectclass;

public class USBPort {
	public static void connect(Object o) {
		if(o instanceof PenDrive) {
		PenDrive p = (PenDrive)o;
		System.out.println("Pendrive connected");
		p.read();
		p.write();
		
		System.out.println("================================");
		}
	//	System.out.println("connected"); //
		else if(o instanceof Mouse) {
		Mouse m =(Mouse)o;
		System.out.println("Mouse connected");
		m.click();
		m.scroll();
		}
		else {
			System.out.println("invalid object");
		}
	}

}
