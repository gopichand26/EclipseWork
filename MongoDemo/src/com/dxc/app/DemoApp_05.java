package com.dxc.app;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DemoApp_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		MongoDatabase mongoDatabase= mongoClient.getDatabase("dxc");
		MongoCollection<Document> mongoCollection=mongoDatabase.getCollection("gadget");
	
		mongoCollection.deleteOne(new Document("name","Mobile"));
		
		System.out.println("Document Deleted Success");
		
		mongoClient.close();
	}

}