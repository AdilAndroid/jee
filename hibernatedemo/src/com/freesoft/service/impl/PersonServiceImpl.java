package com.freesoft.service.impl;

import com.freesoft.bean.Person;
import com.freesoft.dao.PersonDAO;
import com.freesoft.dao.impl.PersonDAOImpl;
import com.freesoft.service.PersonService;

public class PersonServiceImpl implements PersonService {
	@Override
	public void savePerson(Person p) {
		PersonDAO dao = new PersonDAOImpl();
		dao.savePerson(p);
	}
}
