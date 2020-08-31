package com.dxc.progs;

import java.util.Scanner;

public class TryFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first value : ");
		int a = input.nextInt();
		
		System.out.println("Enter second value : ");
		int b = input.nextInt();
		
		try {
			calc(a, b);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("End of the program");
	}
	public static void calc(int n1, int n2) {
		int result ;
		try {
			result = n1 / n2;
			System.out.println("Result is "+result);
		}
		finally {
			System.out.println("End of the calculation");
		}		
	}
}
