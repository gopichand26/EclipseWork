package com.dxc.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/cms")
public class Conversion {
	@GET
	@Path("/{param}")
	public String convert(@PathParam("param") double centimeters) {
		double inches;
		inches= centimeters  * 0.3937;	
		System.out.println("centimeters : " +centimeters+"into inches:"+inches);
		return "cms: "+centimeters+ "in inches:"+inches;
	}
}