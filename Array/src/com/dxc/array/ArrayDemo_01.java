package com.dxc.array;

import java.util.Scanner;

public class ArrayDemo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter array size : ");
		int n = input.nextInt() ;
		
		int []ar = new int[n];
		
		for(int c = 0 ; c < ar.length ; c++) {
			System.out.print("Enter value : ");
			ar[c] = input.nextInt() ;
		}
		
		System.out.println();
		
		System.out.println("Values entered by the user : ");
		for( int c = 0 ; c < ar.length ; c++) {
			System.out.println(c + " - " + ar[c]);
		}
		
		System.out.println("\nEnd of the program");

	}

}
