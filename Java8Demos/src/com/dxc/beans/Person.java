package com.dxc.beans;

public class Person {
	
	int id;
	String name;
	
	Address home;
	Address office;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getHome() {
		return home;
	}
	public void setHome(Address home) {
		this.home = home;
	}
	public Address getOffice() {
		return office;
	}
	public void setOffice(Address office) {
		this.office = office;
	}

	public class Address{
		String hno;
		String city;
		public String getHno() {
			return hno;
		}
		public void setHno(String hno) {
			this.hno = hno;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
	}

}
