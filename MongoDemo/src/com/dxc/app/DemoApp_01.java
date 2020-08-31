package com.dxc.app;

import java.util.Set;


import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class DemoApp_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MongoClient mongoclient = new MongoClient("localhost", 27017);
		MongoDatabase mongoDatabase = mongoclient.getDatabase("dxc");
		MongoCollection<Document> collection = mongoDatabase.getCollection("gadget");
		MongoCursor<Document> mongoCursor = collection.find().iterator();
		mongoCursor.forEachRemaining(DemoApp_01::display);
		
		mongoclient.close();
		
	}
	
	public static void display(Document document) {
		Set<String> keys = document.keySet();
		for(String key : keys) {
			Object value = document.get(key);
			System.out.println(key+" :"+value);
		}
		System.out.println("--------------------");
	}

}
