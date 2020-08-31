package com.dxc.inh2;

public class B extends A {
	
	public B() {
		super();
		System.out.println("Subclass no-param constructor");
	}
	
	public B(int p) {
		super(100);
		System.out.println("Subclass parameter constructor - "+p);
	}

}
