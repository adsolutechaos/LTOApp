package com.devpoint.dao;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.devpoint.model.User;

public class UserDaoTest {

	@Autowired
	UserDao userDao;
	
	@Test
	public void testCreateUser(){
		User user = new User("12345", "123", "123", "123", "123", "123", "123",
				"213", new Date(), 0.0, 0.0, "123", "123", "123", "123", "123", false, "123", "123",
				"123", "123", "123", "123", "123", "123", "123", "123", "123", "123", "123");
		System.out.println(user);
		user = userDao.createUser(user);
	}
}
