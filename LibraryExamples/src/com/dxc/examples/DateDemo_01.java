package com.dxc.examples;

import java.util.Date;

public class DateDemo_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d1 = new Date();
		long t1 = d1.getTime() ;
		
		try {
			for(long c=0;c<1000000l;c++) {
				System.out.println(c);
			}
		}
		
		finally{
			Date d2 = new Date();
			long t2 = d2.getTime();
			
			long duration = t2 - t1;
			System.out.println("The logic executed in "+duration+" milli seconds");
		}
		
		

	}

}
