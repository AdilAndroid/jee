package com.freesoft.struts2.bean;

import java.util.Date;

import org.apache.struts2.json.annotations.JSON;

public class JsonOutputBean {
	private int id;
	private String name;
	private Date date;
	public JsonOutputBean(int id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@JSON(format="YYYY-mm-dd")
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
