package com.dxc.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dxc.model.Person;

public class AopApp_01 {

	public static void main(String[] args) {
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("spring.xml");
		Person person=ctxt.getBean("person",Person.class);
		
		System.out.println(person);
	}
}