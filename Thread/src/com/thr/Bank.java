package com.thr;

public class Bank {
	private double balance=8000;
	
	public synchronized void deposit(double amt) {
		balance=balance+amt;
		System.out.println("Deposited");
		notify();
	}
	public synchronized void withdraw(double amt) {
		if(amt>balance) {
			System.out.println("Amount is depositing");
			try {
				wait(4000);
				System.out.println("Amt withdrawing");
				balance=balance-amt;
				System.out.println("Balance: "+balance);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
		}
		else {
			balance=balance-amt;
			System.out.println("Deposited");
			System.out.println("Remaining balance= "+balance);
		}
	}
	
}
