package com.dxc.app;

import java.util.Scanner;

public class Demo_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the id you want to display : ");
		int id = input.nextInt() ;
		String sql = "SELECT * FROM student WHERE id = " + id ;
		System.out.println("SQL Command to execute on DB : "+sql);
		
		// jdbc code comes here
		// while is not required, since a single record will be fetched into RS
		
//		if(rs.next()) {
//			// ...
//			
//		}
//		else {
//			display id not found
//		}

	}

}
