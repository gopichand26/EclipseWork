package com.dxc.exerpoly;

abstract public class Polygon {
	
	double len ; 
	double bre ;
	
	public void setDim(double len, double bre) {
		this.len = len;
		this.bre = bre;
	}
	
	public void dispDim() {
		System.out.println("Length : "+len+", Breadth : "+bre);
	}
	
	abstract public double getArea() ;

}
