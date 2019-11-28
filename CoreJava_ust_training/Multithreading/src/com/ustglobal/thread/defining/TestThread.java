package com.ustglobal.thread.defining;

public class TestThread {
	public static void main(String[] args) {
		System.out.println("Main started");
		MyThread t1 = new MyThread();
		t1.start();
//		t1.start();
		
		// Don't call run() method, it behaves like normal program
		//all code will be executed inside main thread only
		//t1.run();
		
		for (int i = 0; i <=10; i++) {
			System.out.println("Main thread");
		}
		
		System.out.println("Main ended");
		
	}

}
