package com.dxc.progs;

import java.util.Scanner;

public class UnCaught {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int n1 = input.nextInt() ;
		
		System.out.println("Enter second number : ");
		int n2 = input.nextInt() ;
		
		int res = n1 / n2 ;
		
		System.out.println("Result : "+res);
		
		System.out.println("Thank you for using my program");
	}

}
