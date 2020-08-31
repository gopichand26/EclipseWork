package com.dxc.iface2;

public class App_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Impl12 obj = new Impl12() ;
		
		
		MyIface1 ref1 = obj ;
		ref1.meth1();
		
		MyIface2 ref2 = obj ;
		ref2.meth2();

	}

}
