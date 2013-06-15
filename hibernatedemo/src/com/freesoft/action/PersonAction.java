package com.freesoft.action;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

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
	private List<Person> personList = null;
	private Person person = null;

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
	
	public String list() throws Exception {
		PersonService s = new PersonServiceImpl();
		personList = s.listPerson();
		HttpServletRequest req = ServletActionContext.getRequest();
		req.setAttribute("personList", personList);
		return SUCCESS;
	}
	
	public String describe() throws Exception {
		PersonService s = new PersonServiceImpl();
		Person p = s.personDescribe(id);
		HttpServletRequest req = ServletActionContext.getRequest();
		req.setAttribute("person", p);
		return SUCCESS;
	}
	
	public String delete() throws Exception {
		PersonService s = new PersonServiceImpl();
		s.deletePerson(id);
		return SUCCESS;
	}

	public String updatejsp() throws Exception {
		PersonService s = new PersonServiceImpl();
		Person p = s.personDescribe(id);
		HttpServletRequest req = ServletActionContext.getRequest();
		req.setAttribute("person", p);
		return SUCCESS;
	}
	
	public String update() throws Exception {
		PersonService s = new PersonServiceImpl();
		Person p = s.personDescribe(id);
		
		p.setPassword(password);
		p.setAge(age);
		p.setRegisterDate(registerDate);
		
		s.updatePerson(p);
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

	public List<Person> getPersonList() {
		return personList;
	}

	public Person getPerson() {
		return person;
	}
}
