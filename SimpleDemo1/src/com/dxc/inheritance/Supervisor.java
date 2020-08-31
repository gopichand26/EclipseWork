package com.dxc.inheritance;

public class Supervisor extends Employee {
	
	int exper ;
	
	public void setSupervisor(int exper) {
		this.exper = exper ;
	}
	
	public void dispSupervisor() {
		System.out.println("Experience : "+exper);
	}

}
