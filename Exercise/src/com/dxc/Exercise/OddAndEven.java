package com.dxc.Exercise;

import java.util.Scanner;

public class OddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.println("Integer:");
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		if (x % 2 == 0)
			System.out.println("Integer is even");
		else
			System.out.println("Integer is odd");
	}

}
