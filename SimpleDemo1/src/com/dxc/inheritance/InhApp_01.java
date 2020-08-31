package com.dxc.inheritance;

public class InhApp_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MySuper_01 superObject = new MySuper_01() ;
		
		MySub_01 subObject = new MySub_01();
		
		System.out.println("With object of super class : ");
		superObject.meth1();
		
		System.out.println();
		System.out.println("With object of sub class : ");
		subObject.meth1();
		subObject.meth2();

	}

}
