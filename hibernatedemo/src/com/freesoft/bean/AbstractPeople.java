package com.freesoft.bean;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractPeople entity provides the base persistence definition of the People
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPeople implements java.io.Serializable {

	// Fields
	/**
	 * 
	 */
	private static final long serialVersionUID = 5204051007482195295L;
	
	private long id;
	private String username;
	private String password;
	private Integer telphone;
	private Character gender;
	private boolean graduation;
	private Date birthday;
	private Timestamp marryTime;
	private byte[] file;

	// Constructors

	/** default constructor */
	public AbstractPeople() {
	}

	/** full constructor */
	public AbstractPeople(String username, String password, Integer telphone,
			Character gender, boolean graduation, Date birthday, Timestamp marryTime,
			byte[] file) {
		this.username = username;
		this.password = password;
		this.telphone = telphone;
		this.gender = gender;
		this.graduation = graduation;
		this.birthday = birthday;
		this.marryTime = marryTime;
		this.file = file;
	}

	// Property accessors

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getTelphone() {
		return this.telphone;
	}

	public void setTelphone(Integer telphone) {
		this.telphone = telphone;
	}

	public Character getGender() {
		return this.gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public boolean getGraduation() {
		return this.graduation;
	}

	public void setGraduation(boolean graduation) {
		this.graduation = graduation;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Timestamp getMarryTime() {
		return this.marryTime;
	}

	public void setMarryTime(Timestamp marryTime) {
		this.marryTime = marryTime;
	}

	public byte[] getFile() {
		return this.file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

}