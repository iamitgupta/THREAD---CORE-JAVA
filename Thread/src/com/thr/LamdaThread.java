package com.thr;

public class LamdaThread {

	public static void main(String[] args) {
	Runnable r= () ->
			{
				for(int i=0;i<5;i++) {
					System.out.println(i+1);
				}
			};
			Thread t=new Thread(r);
			t.start();
	}

}
