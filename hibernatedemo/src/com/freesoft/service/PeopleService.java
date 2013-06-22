package com.freesoft.service;

import java.util.List;

import com.freesoft.bean.People;

public interface PeopleService {
	public void insert(People people);
	public List<People> list();
}
