package com.freesoft.struts2.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@ParentPackage(value = "struts-default")
@Namespace(value = "/14-annotation")
@Action(value = "login", results = {
		@Result(name = "success", location = "/14-annotation/result.jsp"),
		@Result(name = "input", location = "/14-annotation/login.jsp") })
@InterceptorRef(value="defaultStack")
public class AnnotationLoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1860178055830603700L;
	private String username;
	private String password;

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

	@Override
	public String execute() throws Exception {
		if (username.equals("aaa") && password.equals("bbb"))
			return SUCCESS;
		else
			return INPUT;
	}

}
