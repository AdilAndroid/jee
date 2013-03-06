package com.freesoft.struts2.service.impl;

import com.freesoft.struts2.service.LoginService;

public class LoginServiceImpl implements LoginService {
	public boolean login(String username, String password) {
		if (username.equals("user") && password.equals("pwd")) {
			return true;
		}
		return false;
	}

}
