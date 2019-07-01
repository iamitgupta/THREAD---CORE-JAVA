package com.thr;

public class BankTest {

	public static void main(String[] args) {
		
		Bank b=new Bank();
		
		Runnable r1= ()->
		{
			b.withdraw(10000);
		};
		
		Runnable r2=()->
		{
			b.deposit(5000);
		};
		
		Thread t1=new Thread(r1);
		t1.start();
		
		Thread t2=new Thread(r2);
		t2.start();
	}

}
