package com.packfly.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.bson.types.ObjectId;
/**
 * 
 * @author Julio Ribeiro
 *
 */
@XmlRootElement
public class User {
	
	
	private ObjectId id;

	private String username;
	
	private String password;
	
	private int age;
	
	

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
}
