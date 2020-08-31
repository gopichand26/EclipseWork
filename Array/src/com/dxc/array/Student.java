package com.dxc.array;

public class Student {
	
	int slno ;
	String name ;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int slno, String name) {
		super();
		this.slno = slno;
		this.name = name;
	}
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [slno=" + slno + ", name=" + name + "]";
	}
	
	

}
