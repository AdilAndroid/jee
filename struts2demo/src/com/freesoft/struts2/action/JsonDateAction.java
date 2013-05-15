package com.freesoft.struts2.action;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.json.annotations.JSON;

import com.freesoft.struts2.bean.JsonOutputBean;
import com.opensymphony.xwork2.ActionSupport;

public class JsonDateAction extends ActionSupport {
	private static final long serialVersionUID = 8594770813208016225L;
	
	private String username;
	private String password;
	private JsonOutputBean bean;
	private Map<String, Object> dataMap;
	
	
	public JsonDateAction() {
		super();
		dataMap = new HashMap<String, Object>();
	}

	@Override
	public String execute() throws Exception {
		dataMap.put("username", username);
		dataMap.put("password", password);		
		Date date = new Date(2012, 1, 12);
		bean = new JsonOutputBean(1, "zhangsan", date);
		dataMap.put("Bean", bean);
		
		return SUCCESS;
	}

//	public String getUsername() {
//		return username;
//	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public JsonOutputBean getBean() {
		return bean;
	}

	public void setBean(JsonOutputBean bean) {
		this.bean = bean;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
}
