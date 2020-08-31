package com.dxc.p1;

public class ThreadApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread( new MyRunnable() ) ;
		t1.start();

	}

}
