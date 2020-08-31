package com.dxc.Exercise;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = in.nextInt();
		int count = 0, sum = 0;
		while (n > 0) {
			sum = sum + n;
			count++;
			System.out.println("Enter number:");
			n = in.nextInt();
		}
		System.out.println("Count" + count);
		System.out.println("Sum is" + sum);
	}
}
