package com.freesoft.action;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.freesoft.bean.People;
import com.freesoft.service.PeopleService;
import com.freesoft.service.impl.PeopleServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class PeopleAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3225270264953516396L;
	private String username;
	private String password;
	private Integer telphone;
	private Character gender;
	private boolean graduation;
	private Date birthday;
	private Timestamp marryTime;
	private byte[] file;
	
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
	public Integer getTelphone() {
		return telphone;
	}
	public void setTelphone(Integer telphone) {
		this.telphone = telphone;
	}
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		this.gender = gender;
	}
	public boolean isGraduation() {
		return graduation;
	}
	public void setGraduation(boolean graduation) {
		this.graduation = graduation;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Timestamp getMarryTime() {
		return marryTime;
	}
	public void setMarryTime(Timestamp marryTime) {
		this.marryTime = marryTime;
	}
	public byte[] getFile() {
		return file;
	}
	public void setFile(byte[] file) {
		this.file = file;
	}

	public String insert() throws Exception {
//		People people = new People(username, password, telphone, gender, graduation, birthday, marryTime, file);
//		InputStream ins = new FileInputStream(new File("D:/商品.xlsx"));
//		byte[] buf = new byte[ins.available()];
//		ins.read(buf);
		byte[] buf = new byte[]{23, 25, 26, 123};
		People people = new People("zhangsan", "mima", 123456789, 'M', true, new java.sql.Date(new java.util.Date().getTime()), new Timestamp(new java.util.Date().getTime()), buf);
		PeopleService service = new PeopleServiceImpl();
		service.insert(people);
		
		return SUCCESS;
	}
	
	public String list() throws Exception {
		PeopleService service = new PeopleServiceImpl();
		List<People> list = service.list();
		Map<String, Object> request = ActionContext.getContext().getContextMap();
		request.put("peoples", list);
		
		return SUCCESS;
	}

}
