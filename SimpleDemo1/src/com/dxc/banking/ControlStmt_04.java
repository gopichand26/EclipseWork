package com.dxc.banking;

import java.util.Scanner;

public class ControlStmt_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int n = input.nextInt();
		while( n > 0) {
			System.out.println("Enter number : ");
			n = input.nextInt();
		}
		
		System.out.println("End of the program !!!");
		
	}

}
