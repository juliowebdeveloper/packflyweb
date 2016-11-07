package com.packfly.utils;

import java.util.Arrays;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoConnection {
	
	private static MongoDatabase database;
	
	
	public synchronized static MongoDatabase getMongoConnection(){
	if(database !=null){
		return database;
	}
	
	MongoCredential credential = MongoCredential.createCredential(
            "packfly", "packfly",
            "packfly".toCharArray());
	MongoClient c = new MongoClient(new ServerAddress("ds139267.mlab.com:39267"), Arrays.asList(credential));
    	database = c.getDatabase("packfly");
    return database;

    
	}
	
	public static void main(String[] args) {
		getMongoConnection();
		MongoCollection<Document> collection = database.getCollection("users");
		 FindIterable<Document> docs = collection.find();
		 for (Document document : docs) {
			System.out.println(document);
		}
	}
	
	
}
