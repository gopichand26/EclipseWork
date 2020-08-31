package com.dxc.p3;

public class ThreadApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(
				new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						System.out.println("Inside of thread");
						
					}
				}
				) ;
		t1.start();

	}

}
