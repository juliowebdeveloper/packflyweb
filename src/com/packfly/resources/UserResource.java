package com.packfly.resources;

import java.util.ArrayList;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.packfly.controller.UserController;
import com.packfly.model.User;

@Path("/users")
public class UserResource {

	
	@GET
	@Path("/findall")
	@Produces("application/json")
	public ArrayList<User> findAll(){
		UserController uc = new UserController();
		return uc.getUsers();
	}
	
	/*
	@GET
	@Path("/findone/{username}")
	@Produces("application/json")
	public User getOne(@PathParam("username") String username){
		UserController uc = new UserController();
		return uc.getUser(username);
	}
	*/
}
