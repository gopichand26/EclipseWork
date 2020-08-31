package com.dxc.Exercise;

import java.util.Scanner;

public class sumoddeven {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = in.nextInt();
		int count = 0, sum = 0, sumOdd = 0, sumEven = 0;
		while (n > 0) {
			sum = sum + n;
			if (n % 2 == 0) {
				sumEven = sumEven + n;
			} else {
				sumOdd = sumOdd + n;
			}
			count++;
			System.out.println("Enter number:");
			n = in.nextInt();
		}
		System.out.println("Count " + count);
		System.out.println("Sum is" + sum);
		System.out.println("Sum of odd is " + sumOdd);
		System.out.println("Sum of even is " + sumEven);
	}
}
