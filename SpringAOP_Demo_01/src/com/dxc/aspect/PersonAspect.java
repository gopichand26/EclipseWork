package com.dxc.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PersonAspect {

	
	@Before("execution(String getName())")
	public void getNameAdvice() {
		System.out.println("advice before getterr");
	}

	@Before("execution(* get*())")
	public void getIdAdvice() {
		System.out.println("advice before getter charater");
	}
}