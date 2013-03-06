package com.freesoft.struts2.action;

import com.freesoft.struts2.service.LoginService;
import com.freesoft.struts2.service.impl.LoginServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class MultiTierLoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6443602936420143592L;
	private String username;
	private String password;
	
	private LoginService service = new LoginServiceImpl();
	
	@Override
	public String execute() throws Exception {
		if (service.login(username, password)) {
			return SUCCESS;
		}
		return INPUT;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
