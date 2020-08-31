package com.dxc.p2;

public class ThreadApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyRunnable());
		t1.start();

	}
	
	static class MyRunnable implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Inside of thread");
			
		}
		
	}

}
