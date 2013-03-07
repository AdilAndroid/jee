package com.freesoft.struts2.action;

import java.util.Date;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class GetContainerObjectAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1043221376792566123L;
	
	private String username;
	private String password;
	private int age;
	private Date birthday;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Override
	public String execute() throws Exception {
		// page
		PageContext page = ServletActionContext.getPageContext();
		page.setAttribute("attr", "http request attr.");
		// request
		HttpServletRequest req = ServletActionContext.getRequest();
		req.setAttribute("attr", "http request attr.");
		// session
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("attr", "session attr.");
		// page context
		ServletContext context = ServletActionContext.getServletContext();
		context.setAttribute("attr", "context attr.");
		
		Map<String, Object> paramMap = ActionContext.getContext().getParameters();
		paramMap.put("map", "paramMap");
		Map<String, Object> contextMap = ActionContext.getContext().getContextMap();
		contextMap.put("map", "contextMap");
		Map<String, Object> sessionMap = ActionContext.getContext().getSession();
		sessionMap.put("map", "sessionMap");
		Map<String, Object> applicationMap = ActionContext.getContext().getApplication();
		applicationMap.put("map", "applicationMap");
		
		
		return SUCCESS;
	}
	

}
