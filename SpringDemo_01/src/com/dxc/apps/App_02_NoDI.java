package com.dxc.apps;

import com.dxc.beans.Address;
import com.dxc.beans.Person;

public class App_02_NoDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add1 = new Address(101, "er-43", "2nd street", "chennai");
		
		Person person1 = new Person();
		person1.setId(101);
		person1.setName("chandu");
		person1.setEmail("chandu@gmail.com");
		person1.setAddress(add1);
		
		System.out.println(person1);

	}

}
