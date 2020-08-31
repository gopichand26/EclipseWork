package com.dxc.app;

import com.dxc.beans.Calculator;


public class CalcApp_02 {
	public static void main(String[] args) {
		
		Calculator adder = (n1, n2) -> n1 + n2	;
		
		Calculator multiplier = (a, b) -> a * b ;
		
		System.out.println(adder.calc(5, 8));
		System.out.println(multiplier.calc(8, 5));
		
		
	}
	


	
}
