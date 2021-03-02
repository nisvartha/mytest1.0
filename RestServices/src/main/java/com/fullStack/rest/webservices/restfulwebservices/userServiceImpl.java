package com.fullStack.rest.webservices.restfulwebservices;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;

public class userServiceImpl implements userService{
	
	@Autowired
	private userRepository userrepo;
	
	public List<user> getUsers(){
		List<user> out = new ArrayList<user>();
		userrepo.findAll().forEach(user->out.add(user));
		return out;
	}

} // End of class userServiceImpl
