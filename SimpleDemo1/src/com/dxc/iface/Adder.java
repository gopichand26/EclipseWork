package com.dxc.iface;

public class Adder implements MyIface1 {

	// Interface method
	@Override
	public int calculate(int num1, int num2) {
		int sum ;
		sum = num1 + num2 ;
		System.out.println("Calculation method invoked from Adder implementation");
		return sum ;
	}
	
	public void sayHello() {
		System.out.println("Hello users !!!");
	}

}
