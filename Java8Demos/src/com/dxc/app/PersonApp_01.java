package com.dxc.app;

import com.dxc.beans.Person;

public class PersonApp_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person() ;
		p1.setHome( p1.new Address() );
		p1.setOffice( p1.new Address() );
		

	}

}
