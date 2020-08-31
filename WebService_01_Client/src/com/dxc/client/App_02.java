package com.dxc.client;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class App_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClientConfig clientconfig = new ClientConfig();
		Client client = ClientBuilder.newClient(clientconfig);
		
		URI uri = UriBuilder.fromUri("http://localhost:8080/WebService_01/rest/cms/180").build();
		
		WebTarget webtarget = client.target(uri);
		
		System.out.println(webtarget.request().accept(javax.ws.rs.core.MediaType.TEXT_PLAIN).get(String.class));

	}

}