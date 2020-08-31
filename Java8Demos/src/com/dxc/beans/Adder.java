package com.dxc.beans;

public class Adder implements Calculator {

	@Override
	public int calc(int n1, int n2) {
		return n1 + n2;
	}

}
