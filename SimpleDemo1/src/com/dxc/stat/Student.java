package com.dxc.stat;

public class Student {
	
	int slno ;
	static int statInt ;
	
	public Student(int slno) {
		this.slno = slno ;
		statInt ++ ;
	}
	
	public void dispSlno() {
		System.out.println("Slno : "+slno);
	}
	
	public static void dispStat() {
		System.out.println("static int : "+statInt);
//		System.out.println("Try : "+slno);
	}

}
