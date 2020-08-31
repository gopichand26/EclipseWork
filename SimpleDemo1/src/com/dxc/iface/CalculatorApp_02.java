package com.dxc.iface;

public class CalculatorApp_02 {

	public static void main(String[] args) {
		
		MyIface1 calc ; 
		int res;
		
		
		calc = new Adder();
		res = calc.calculate(10, 15);
		System.out.println("Result 1 : " + res);
		
		calc = new Multiplier() ;
		res = calc.calculate(10, 15);
		System.out.println("Result 2 : " + res);
		
		

	}

}
