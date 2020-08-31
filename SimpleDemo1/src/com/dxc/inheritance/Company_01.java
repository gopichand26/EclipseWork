package com.dxc.inheritance;

public class Company_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee() ;
		
		Supervisor sup1 = new Supervisor() ;
		
		Manager man1 = new Manager() ;
		
		emp1.setEmp(101, "Kishor");
		
		sup1.setEmp(201, "Rajesh");
		sup1.setSupervisor(15);
		
		man1.setEmp(301, "Vijay");
		man1.setManager(18);
		
		System.out.println("Object of Employee Class : ");
		emp1.dispEmp();
		
		System.out.println();
		System.out.println("Object of Supervisor Class : ");
		sup1.dispEmp();
		sup1.dispSupervisor();
		
		System.out.println();
		System.out.println("Object of Manager Class : ");
		man1.dispEmp();
		man1.dispManager();
		
	}

}
