package com.freesoft.action;

import java.util.Date;

import com.freesoft.bean.Person;
import com.freesoft.service.PersonService;
import com.freesoft.service.impl.PersonServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class PersonAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6658526205632755329L;
	
	private int id;
	private String username;
	private String password;
	private int age;
	private Date registerDate;

	public String save() throws Exception {
		Person p = new Person();
		p.setUsername(username);
		p.setPassword(password);
		p.setAge(age);
		registerDate = new Date();
		p.setRegisterDate(registerDate);
		
		PersonService service = new PersonServiceImpl();
		service.savePerson(p);
		return SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
}
