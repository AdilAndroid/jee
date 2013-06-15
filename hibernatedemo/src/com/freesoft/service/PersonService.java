package com.freesoft.service;

import java.util.List;

import com.freesoft.bean.Person;

public interface PersonService {
	public void savePerson(Person p);
	public List<Person> listPerson();
	public void deletePerson(int id);
	public Person personDescribe(int id);
	public void updatePerson(Person p);
}
