package com.dxc.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dxc.beans.Calculator;

public class CalculatorTest {
	
	Calculator calc = null;
	
	@BeforeClass
	public static void meth3() {
		System.out.println("Start Testing");
	}
	
	@AfterClass
	public static void meth4() {
		System.out.println("Testing Completed");
	}
	
	@Before
	public void meth1() {
		calc = new Calculator();
	}
	
	@After
	public void meth2() {
		calc = null;
	}

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		assertEquals(25, cal.add(10, 15));
		assertEquals(20, cal.add(11,9));
		assertNotEquals(12, cal.add(19,2));
		assertNotEquals(15, cal.add(19,12));
	}

	@Test
	public void testSub() {
		Calculator cal = new Calculator();
		assertEquals(5 ,cal.sub(15,10));
		assertEquals(5 ,cal.sub(24,19));
		assertNotEquals(12, cal.sub(19,2));
		assertNotEquals(15, cal.sub(23,12));

	}

	@Test
	public void testDiv() {
		Calculator cal = new Calculator();
		assertEquals(3, cal.div(38, 10),0.8);
		assertEquals(1, cal.div(18, 10),0.8);
		assertEquals(1, cal.div(17, 10),0.7);
		assertNotEquals(4,cal.div(12, 5),0.876);
		assertNotEquals(1, cal.div(36, 5),0.3);
		
	}
	
	@Test
	public void testMul() {
		Calculator cal = new Calculator();
		assertEquals(150, cal.mul(10, 15));
		assertEquals(99, cal.mul(11,9));
		assertNotEquals(12, cal.mul(19,2));
		assertNotEquals(15, cal.mul(19,12));

	}

}