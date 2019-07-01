package com.thr;

public class DemoThread extends Thread{
	@Override
	public void run() {
		Thread d=Thread.currentThread();
		System.out.println(d.getName());
		for(int i=0;i<5;i++)
			System.out.println(i+1);
	}
	
	

	public static void main(String[] args) {
		
		
		Thread d=Thread.currentThread();
		System.out.println(d.getName());
		
		DemoThread t=new DemoThread();
		t.start();
	}

}
