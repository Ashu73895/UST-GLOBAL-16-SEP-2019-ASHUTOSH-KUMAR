package com.ustglobal.thread.pausing;

public class MyJoinThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 11; i++) {
			System.out.println("Child thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
