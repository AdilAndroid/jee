package com.freesoft.service.impl;

import java.util.List;

import com.freesoft.bean.People;
import com.freesoft.dao.PeopleDAO;
import com.freesoft.dao.impl.PeopleDAOImpl;
import com.freesoft.service.PeopleService;

public class PeopleServiceImpl implements PeopleService {

	@Override
	public void insert(People people) {
		PeopleDAO dao = new PeopleDAOImpl();
		dao.insert(people);
	}

	@Override
	public List<People> list() {
		PeopleDAO dao = new PeopleDAOImpl();
		return dao.list();
	}

}
