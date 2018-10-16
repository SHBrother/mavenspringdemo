package com.ma.service.impl;

import com.ma.dao.PersonDao;
import com.ma.service.PersonService;

public class PersonServiceImpl  implements PersonService{

	private PersonDao personDao;
	
	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	public void processSave() {
		System.out.println("========from PersonService processSave()");
		
		personDao.save();
	}

}
