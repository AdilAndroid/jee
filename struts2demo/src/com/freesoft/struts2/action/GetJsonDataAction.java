package com.freesoft.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class GetJsonDataAction extends ActionSupport {
	private String name;
	private String username;
	private String password;

	/**
	 * 
	 */
	private static final long serialVersionUID = 2215207688023353393L;

	@Override
	public String execute() throws Exception {
		username = name;
		password = "password: " + username;
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
