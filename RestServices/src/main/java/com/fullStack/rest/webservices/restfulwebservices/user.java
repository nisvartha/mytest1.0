package com.fullStack.rest.webservices.restfulwebservices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class user {
	
	@javax.persistence.Id
	private int iduser;
	private String username;
	private String userdtl1;
	private String userdtl2;
	/**
	 * 
	 */
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param iduser
	 * @param username
	 * @param userdtl1
	 * @param userdtl2
	 */
	public user(int iduser, String username, String userdtl1, String userdtl2) {
		super();
		this.iduser = iduser;
		this.username = username;
		this.userdtl1 = userdtl1;
		this.userdtl2 = userdtl2;
	}
	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserdtl1() {
		return userdtl1;
	}
	public void setUserdtl1(String userdtl1) {
		this.userdtl1 = userdtl1;
	}
	public String getUserdtl2() {
		return userdtl2;
	}
	public void setUserdtl2(String userdtl2) {
		this.userdtl2 = userdtl2;
	}
	@Override
	public String toString() {
		return "user [iduser=" + iduser + ", username=" + username + ", userdtl1=" + userdtl1 + ", userdtl2=" + userdtl2
				+ "]";
	}

	


}
