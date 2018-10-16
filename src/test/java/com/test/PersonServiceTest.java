package com.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ma.service.PersonService;

public class PersonServiceTest {
	private BeanFactory  factory = null;
	
	@Before
	public void before(){
		factory = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void testSpring(){
		PersonService pservice = (PersonService) factory.getBean("personService");
		pservice.processSave();
	}
}
