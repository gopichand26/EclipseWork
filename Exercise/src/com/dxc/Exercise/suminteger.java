package com.dxc.Exercise;

import java.util.Scanner;

public class suminteger
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = in.nextInt();
		int i, num, sum=0;
		for(i=0; i<n; i++) {
			num = in.nextInt();
			sum = sum + num;
		}
		System.out.println("sum is : " + sum);
	}
}
