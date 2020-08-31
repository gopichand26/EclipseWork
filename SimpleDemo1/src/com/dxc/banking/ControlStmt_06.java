package com.dxc.banking;

import java.util.Scanner;

public class ControlStmt_06 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many times ? ");
		int nofTimes = input.nextInt();
		
		for(int c = 1 ; c <= nofTimes ; c++) {
			System.out.println(c);
		}
		
		System.out.println("Thank you");
	}

}
