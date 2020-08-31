package com.dxc.iface;

public class Multiplier implements MyIface1 {

	@Override
	public int calculate(int num1, int num2) {
		int prod ;
		prod = num1 * num2 ;
		System.out.println("Calculation method invoked from Multiplier implementation");
		return prod;
	}

}
