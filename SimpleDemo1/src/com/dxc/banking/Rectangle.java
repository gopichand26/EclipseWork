package com.dxc.banking;

public class Rectangle {
	private double len;
	private double bre;
	
	// Explicit constructor - Constructor written by developer
	public Rectangle() {
		len = 0.0;
		bre = 0.0;
	}
	
	public Rectangle(double l, double b) {
		len = l;
		bre = b;
	}
	
	public double getArea() {
		double area ;
		area = len * bre ;
		return area ;
	}
	
	public double getPeremeter() {
		double pere ;
		pere = 2 * (len + bre);
		return pere ;
	}
	
	public void setDim(double l, double b) {
		len = l;
		bre = b;
	}
	
	public void setDim(double side) {
		len = side;
		bre = side;
	}
	
	public void dispDim() {
		System.out.println("Length : "+len+", Breadth : "+bre);
	}
	
	public String toString() {
		return "Rectanlge [len : "+len+", bre : "+bre+"]";
	}
	
}
