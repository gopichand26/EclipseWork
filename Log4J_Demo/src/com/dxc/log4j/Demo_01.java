package com.dxc.log4j;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Demo_01 {
	
	static Logger log = Logger.getLogger(Demo_01.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		log.debug("Welcome to the logic");
		
		System.out.println("Enter range : ");
		int range = scanner.nextInt();
		log.info("user given value : "+range);
		for(int c=0; c< range ; c++) {
			
			log.info("current c value : "+c);
			
			System.out.println(c);
			if(c % 3 ==0) {
				System.out.println(c + "is multiple of 3");
			}
			
			log.info("logic complete with "+c);
		}
		
		log.debug("Program execution completed");

	}

}
