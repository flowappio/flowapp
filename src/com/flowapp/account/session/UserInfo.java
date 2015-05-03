package com.flowapp.account.session;

import java.io.Serializable;

import com.flowapp.db.user.User;


public class UserInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	

	/**
	 * Email address of the user logged in
	 */
	private String userMail;

	/**
	 * Name of the user logged in
	 */
	private String userName;

	private Long userId;

	private UserInfo() {

	}
	
	public UserInfo(User user)
	{
	}
	


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getUserMail() {
		return userMail;
	}

	public String getUserName() {
		return userName;
	}

	public Long getUserId() {
		return userId;
	}
}
