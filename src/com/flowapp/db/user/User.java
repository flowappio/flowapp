package com.flowapp.db.user;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.googlecode.objectify.annotation.NotSaved;

@XmlRootElement
public class User {

	private String userName;
	
	private String email;
	
	@NotSaved
	private String password;
	
	@JsonIgnore
	private String hashedPassord;
	
	User() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}
	
	public String getUserName() {
		return userName;
	}

	public String getHashedPassord() {
		return hashedPassord;
	}

	
}
