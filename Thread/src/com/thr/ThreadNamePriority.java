package com.thr;

public class ThreadNamePriority {

	public static void main(String[] args) throws InterruptedException{
		Thread t4;
		Runnable r1= () ->
		{
		Thread t1=Thread.currentThread();
			System.out.println("Thread Name: "+t1.getName());
			System.out.println("Thread ID: "+t1.getId());
			System.out.println("Thread priority: "+t1.getPriority());
			
			for(int i=1;i<11;i++) {
				System.out.println(i);
				try {
					t1.sleep(500);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		Thread t2=new Thread(r1);
		t2.start();
		t2.sleep(500);
		//t2.join();
		
		Runnable r2= () ->
		{
			Thread t3=Thread.currentThread();
			t3.setName("Amit");
			t3.setPriority(4);
			System.out.println("Thread Name: "+t3.getName());
			System.out.println("Thread ID: "+t3.getId());
			System.out.println("Thread priority: "+t3.getPriority());
			for(int i=11;i<20;i++) {
				System.out.println(i);
				try {
					t3.sleep(500);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		t4=new Thread(r2);
		t4.start();
		t4.sleep(500);
	}

}
