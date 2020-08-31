package com.dxc.progs;

import java.util.Scanner;

public class Caught_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int n1 = input.nextInt() ;
		
		System.out.println("Enter second number : ");
		int n2 = input.nextInt() ;
		
		try {
			
			int res = n1 / n2 ;
			System.out.println("Result : "+res);
			
		}
		catch(ArithmeticException ae) {
			
			System.out.println("Exception caught");
			
		}
		
		System.out.println("Thank you for using my program");
	}

}
