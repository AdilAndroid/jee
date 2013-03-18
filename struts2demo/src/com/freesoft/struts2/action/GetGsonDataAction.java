package com.freesoft.struts2.action;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.freesoft.struts2.bean.User;
import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

public class GetGsonDataAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2825133975091251752L;
	private String name;

	@Override
	public String execute() throws Exception {
		ArrayList<User> users = new ArrayList<User>();
		for (int i = 0; i < 2; i++) {
			User user = new User();
			user.setUsername(name);
			user.setPassword("password:" + name);
			users.add(user);
		}
		Gson gson = new Gson();
		String result = gson.toJson(users);

		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/json; chaset=utf-8");
		response.setHeader("cache-control", "no-cache");
		PrintWriter out = response.getWriter();
		out.print(result);

		out.flush();
		out.close();
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
