package com.freesoft.dao;

import java.util.List;

import com.freesoft.bean.Person;

public interface PersonDAO {
	public void savePerson(Person p);
	public List<Person> listPerson();
	public void deletePerson(int id);
	public Person personDescribe(int id);
	public void updatePerson(Person p);
}
