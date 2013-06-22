package com.freesoft.dao;

import java.util.List;

import com.freesoft.bean.People;

public interface PeopleDAO {
	public void insert(People people);
	public List<People> list();
}
