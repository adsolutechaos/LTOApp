package com.devpoint.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.devpoint.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	EntityManager em;
	public User createUser(User user) {
		em.persist(user);
		return user;
	}

}
