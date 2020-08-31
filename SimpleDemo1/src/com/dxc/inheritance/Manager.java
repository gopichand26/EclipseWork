package com.dxc.inheritance;

public class Manager extends Employee {
	
	int qual ;
	
	public void setManager(int qual) {
		this.qual = qual; 
	}
	
	public void dispManager() {
		System.out.println("Qualification : "+qual);
	}

}
