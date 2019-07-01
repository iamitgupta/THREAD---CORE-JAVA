package com.thr;

public class DemoRunnable implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i+1);
		}
	}
	public static void main(String[] args) {
		DemoThread d= new DemoThread();
		Thread t=new Thread(d);
		t.start();
	}

	

}
