package com.dxc.inh2;

public class UseAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Instantiating subclass without parameters");
		B b1 = new B();
		
		System.out.println();
		
		System.out.println("Instantiating subclass with ONE parameter - "+15);
		B b2 = new B(15);

	}

}
