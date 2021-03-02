package com.fullStack.rest.webservices.restfulwebservices;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public interface userService {
	List<user> getUsers();
	
}
