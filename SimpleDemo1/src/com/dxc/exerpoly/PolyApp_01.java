package com.dxc.exerpoly;

public class PolyApp_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polygon p ;
		
		p = new Triangle();
		p.setDim(8.5, 6.3);
		System.out.println("p with Triangle object");
		p.dispDim();
		System.out.println("Area : "+p.getArea());
		
		System.out.println();
		
		p = new Rectangle();
		p.setDim(9, 6);
		System.out.println("p with Rectangle object");
		p.dispDim();
		System.out.println("Area : "+p.getArea());
		
		System.out.println();
		
//		p = new Polygon();
//		p.setDim(9, 6);
//		System.out.println("p with Rectangle object");
//		p.dispDim();
//		System.out.println("Area : "+p.getArea());

	}

}
