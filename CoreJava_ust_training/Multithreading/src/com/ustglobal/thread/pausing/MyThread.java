package com.ustglobal.thread.pausing;

public class MyThread extends Thread{
@Override
public void run() {
	for(int i =0;i<11;i++) {
		System.out.println("child thread");
		Thread.yield();
	}
}
}
