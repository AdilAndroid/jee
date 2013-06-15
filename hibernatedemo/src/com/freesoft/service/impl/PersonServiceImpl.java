package com.freesoft.service.impl;

import java.util.Date;
import java.util.List;

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

	@Override
	public List<Person> listPerson() {
		PersonDAO dao = new PersonDAOImpl();
		return dao.listPerson();
	}

	@Override
	public void deletePerson(int id) {
		PersonDAO dao = new PersonDAOImpl();
		dao.deletePerson(id);
	}

	@Override
	public Person personDescribe(int id) {
		PersonDAO dao = new PersonDAOImpl();
		return dao.personDescribe(id);
	}

	@Override
	public void updatePerson(Person p) {
		PersonDAO dao = new PersonDAOImpl();
		dao.updatePerson(p);
	}
}
