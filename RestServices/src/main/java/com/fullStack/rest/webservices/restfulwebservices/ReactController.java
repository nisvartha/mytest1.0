package com.fullStack.rest.webservices.restfulwebservices;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReactController {
	
@Autowired
private userRepository userrepo;
	
	@RequestMapping (value = "/")
	public String helloWorld() {
		System.out.println("inside HelloWorld");
		return "Hello World";
	}

  /* 
	@PutMapping("/upd/{id}")
    public void update(int iduser, String name) {
   
			//user myUser = userrepo.findById(id);
			//	List<user> myUser = new ArrayList<user>();
			user myUser1 = userrepo.findById(iduser).orElseThrow(IllegalArgumentException::new);
			System.out.println("data object >>" + myUser1.toString());
			
			
		//	myUser(username = name;
			// userrepo.save(myUser);
		//	myUser.setIduser(20);
		//	myUser.setUsername(name);
		//	myUser.setUserdtl1(userdtl1);
		//	myUser.setUserdtl2(userdtl2);
    } // End of update function
*/
	@PostMapping("/user")
    public user create(@RequestBody Map< String,String> body){
		

		//int Id = 12;
        String username = body.get("username");   
        System.out.println("Name received from postman::" + username );
        String userdtl1 = body.get("userdtl1");
        System.out.println("userdtl1 received from postman::" + userdtl1 );
        String userdtl2 = body.get("userdtl2");
        
        user data = new user();
        
        data.setIduser(20);
        data.setUsername(username);
        data.setUserdtl1(userdtl1);
        data.setUserdtl2(userdtl2);
        
        System.out.println("data object >>" + data.toString());       
        
        user pants = userrepo.save(data);
        return pants;
	} // End of create function   
	
	@PutMapping("/user/{id}")
	public void updateUser(user u) {
		    
	} // End of updateuser
   
	@GetMapping("/select")
    public void showselected(){
		
		List<user> list;
    	
        System.out.println(" -- finding by name containing %te%  --");
        list = userrepo.findByName("TG");
        list.forEach(System.out::println);
        
      
 } // End of showselected
	/*
	@Autowired
	private userService userservice;
	

	@GetMapping("/all")

	public List<user> getAllUsers(){
		
		return userservice.getUsers();
	}
	
	public void showall(){
    	
    	System.out.println(" -- finding all use --");
        Iterable<user> all = userrepo.findAll();
        all.forEach(System.out::println);
 } // End of showall
*/
} /* End of class React Controller */

