package com.freesoft.struts2.action;

import java.util.List;

import com.freesoft.struts2.bean.User;
import com.opensymphony.xwork2.ActionSupport;

public class UsersAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5119876095337182994L;
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String execute() throws Exception {
		for(User u: users) {
			System.out.println(u.getUsername() + ";" + u.getPassword());
		}
		return SUCCESS;
	}
}
