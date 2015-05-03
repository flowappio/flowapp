package com.flowapp.account;

import javax.servlet.http.HttpServletRequest;

import com.flowapp.account.session.UserInfo;
import com.flowapp.globals.AccountGlobals;

public class LoginHandler {
	private HttpServletRequest request;
	
	private UserInfo userInfo;
	
	private LoginHandler() {
		// TODO Auto-generated constructor stub
	}
	
	public LoginHandler(HttpServletRequest request)
	{
		this.request = request;
	}
	
	public UserInfo getUserInfo()
	{
		if(userInfo != null)
			return userInfo;
		
		String email = request.getParameter(AccountGlobals.LOGIN_EMAIL);
		String name = request.getParameter(AccountGlobals.USER_NAME);
		String password = request.getParameter(AccountGlobals.PASSWORD);
		
		return null;
	}
	
	
	private boolean isValidUser()
	{
		return false;
	}
	
}
