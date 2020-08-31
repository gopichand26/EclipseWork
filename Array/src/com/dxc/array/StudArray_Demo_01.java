package com.dxc.array;

import java.util.Scanner;

public class StudArray_Demo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Collection is recommended over Array
		
		Scanner input = new Scanner(System.in);
		
		Student []students = new Student[5];
		
		for (int c = 0 ; c < students.length ; c++) {
			
			System.out.println("Enter slno : ");
			int slno = input.nextInt();
			
			System.out.println("Enter name : ");
			String name = input.next();
			
			students[c] = new Student(slno, name);
		}
		
		System.out.println("\nInput Completed\n");
		
		for(int c = 0 ; c < students.length ; c++) {
			System.out.println("student at "+c+" index is "+students[c]);
//			System.out.println("Total Marks : "+students[c].getTotal());
		}

	}

}
