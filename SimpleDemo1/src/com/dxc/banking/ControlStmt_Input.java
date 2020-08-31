package com.dxc.banking;

import java.util.Scanner;

public class ControlStmt_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your city : ");
		String city = input.next();
		
		System.out.println("Enter first value : ");
		int a = input.nextInt();
		
		System.out.println("Enter second value : ");
		int b = input.nextInt();
		
		System.out.println("Enter your name : ");
		String name = input.next();
		
		if(a < b) {
			System.out.println("a is smaller value");
		}
		else {
			System.out.println("a is not a smaller value");
		}
		
		System.out.println("Thank you "+name+" from "+city+", Visit again !!!");

	}

}
