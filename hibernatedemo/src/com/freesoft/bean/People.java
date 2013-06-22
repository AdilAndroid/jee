package com.freesoft.bean;

import java.sql.Timestamp;
import java.util.Date;

/**
 * People entity. @author MyEclipse Persistence Tools
 */
public class People extends AbstractPeople implements java.io.Serializable {

	// Constructors

	/**
	 * 
	 */
	private static final long serialVersionUID = 1189615082605863403L;

	/** default constructor */
	public People() {
	}

	/** full constructor */
	public People(String username, String password, Integer telphone,
			Character gender, boolean graduation, Date birthday, Timestamp marryTime,
			byte[] file) {
		super(username, password, telphone, gender, graduation, birthday,
				marryTime, file);
	}

}
