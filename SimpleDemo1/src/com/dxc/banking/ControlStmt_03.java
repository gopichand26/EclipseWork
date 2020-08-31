package com.dxc.banking;

import java.util.Scanner;

public class ControlStmt_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a character : ");
		String color = input.next();
		
		char col = color.charAt(0) ;
		
		switch (col) {
		
		case 'r' :
			System.out.println("RED");
			break;
		case 'g' :
			System.out.println("GREEN");
			break;
			
		case 'b' :
			System.out.println("BLUE");
			break;
			
		default:
			System.out.println("Invalid input");	
		}
		System.out.println("Thank you for choosing colors");

	}

}
