package com.dxc.iface;

public class CalculatorApp_01 {

	public static void main(String[] args) {
		
		Adder myAdder = new Adder();
		int sum = myAdder.calculate(10, 15);
		
		Multiplier myMultiplier = new Multiplier();
		int prod = myMultiplier.calculate(10, 15);
		
		System.out.println("Sum : "+sum);
		System.out.println("Product : "+prod);
		myAdder.sayHello();

	}

}
