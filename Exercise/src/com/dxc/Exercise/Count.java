package com.dxc.Exercise;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = in.nextInt();
		int count = 0;
		while (n > 0) {
			count++;
			System.out.println("Enter number:");
			n = in.nextInt();
		}
		System.out.println("Count" + count);
	}
}
