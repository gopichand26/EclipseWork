package com.dxc.app;

import com.dxc.beans.Adder;
import com.dxc.beans.Calculator;
import com.dxc.beans.Multiplier;

public class CalcApp_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator a = new Adder();
		Calculator m = new Multiplier() ;
		System.out.println("sum : "+a.calc(8, 5));
		System.out.println("Product : "+m.calc(8, 5));

	}

}
