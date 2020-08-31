package com.dxc.examples;

import java.util.Calendar;
import java.util.Date;

public class CalDemo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH);
		int d = cal.get(Calendar.DATE);
		
		System.out.println(d+" "+m+" "+y);
		
		Date d1 = cal.getTime() ;
		System.out.println("old Date d1 : "+d1);
		
		cal.set(Calendar.DATE, d+10);
		Date d2 = cal.getTime();
		System.out.println("new Date d2 : "+d2);
		
		

	}

}
