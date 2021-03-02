package com.fullStack.rest.webservices.restfulwebservices;


import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface userRepository extends CrudRepository<user, Integer> { 
	


	
	  @Query("SELECT e FROM user e WHERE e.username LIKE %?1%")
	  public List<user> findByName(String username);

	public void saveAll(Optional<user> myUser);
	  
	  
//	  @Query("SELECT e FROM user e WHERE e.name LIKE %?1%")
//	  public List<user> findByusername2(String username);

//	  public List<user> findByNameContaining(String username);


//	public List<user> findByNameContaining(String username);
	  

	/*
	@Query("SELECT p FROM user p WHERE p.username LIKE %?keyword%"
			" OR p.userdtl1 LIKE %?keyword% "
			+ " OR p.userdtl2 LIKE %?keyword%")  */
	}


