package com.dxc.progs;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter account balance : ");
		int bal = input.nextInt() ;
		
		System.out.println("Enter the product cost : ");
		int cost = input.nextInt();
		
		try{
			if(bal < cost) {
				ArithmeticException ae = new ArithmeticException("Low balance "+bal);
				throw ae;
			}
			
			bal = bal - cost;
			
			System.out.println("Balance of your account after you bought : "+bal);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("\n------------Balance is : "+bal+"----------\n");
		}
		
		finally{
			System.out.println("Thank you for using XYZ Banking");
		}
		

	}

}
