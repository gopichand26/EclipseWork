package com.dxc.progs;

import java.util.Scanner;

public class ExceptionDemo_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int []ar = new int[5];
		
		System.out.println("Enter array elements below : ");
		for(int c=0;c<5;c++) {
			ar[c] = input.nextInt() ;
		}
		
		System.out.println("Enter index you want to display : ");
		int n = input.nextInt() ;
		
		try {
			System.out.println("Element at the given index is : " + ar[n]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("End of the program");
		
		

	}

}
