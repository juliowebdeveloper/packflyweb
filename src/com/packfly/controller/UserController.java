package com.packfly.controller;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.packfly.dao.UserDAO;
import com.packfly.model.User;


public class UserController {

	private ArrayList<User> users;

	private UserDAO dao;
	
	@PostConstruct
	public void init(){
		
	}
	
	public User getUser(String username){
		dao = new UserDAO();
		return dao.findUser(username);
	}
	
	
	public ArrayList<User> getUsers() {
		dao = new UserDAO();
		return dao.findUsers();
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	
	
	
	
	
	
}
