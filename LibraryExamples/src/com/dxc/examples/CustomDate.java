package com.dxc.examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CustomDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String str = sdf.format(new Date());
		System.out.println("Today : "+str);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any date (dd-mm-yyyy) : ");
		String strDate = input.next();
		
		try {
			Date date = sdf.parse(strDate);
			System.out.println("Date object : "+date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
