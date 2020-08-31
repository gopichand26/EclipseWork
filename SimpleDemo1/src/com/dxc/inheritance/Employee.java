package com.dxc.inheritance;

public class Employee {
	
	int code;
	String name;
	
	public void setEmp(int code, String name) {
		this.code = code ;
		this.name = name ;
	}
	
	public void dispEmp() {
		System.out.println("Code : "+code+", Name : "+name);
	}

}
