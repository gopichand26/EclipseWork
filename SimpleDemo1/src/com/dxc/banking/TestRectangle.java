package com.dxc.banking;

public class TestRectangle {

	public static void main(String[] args) {
		
		// Instantiating Rectangle with custom values
		Rectangle r1 = new Rectangle(8.5, 6.3);
		
		// Instantiating Rectangle with out values
		Rectangle r2 = new Rectangle();
		
		r1.dispDim();
		r2.dispDim();
		
		r1.setDim(8.5, 6.3);  // No require, because we specified values in the constructor
	
		// Overloaded setDim
		r2.setDim(9.3);
		
		double a1 = r1.getArea() ;
		double a2 = r2.getArea() ;
		
		double p1 = r1.getPeremeter() ;
		double p2 = r2.getPeremeter() ;
		
		System.out.println("r1 : ");
		System.out.println(r1.toString());
		System.out.println("r1 area is "+a1+" and peremeter is "+p1);
		
		
		System.out.println("r2 : " + r2.toString());
		System.out.println("r2 area is "+a2+" and peremeter is "+p2);

	}

}
