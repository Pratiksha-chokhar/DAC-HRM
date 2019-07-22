package com.springhrms.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springhrms.dao.UserDAO;
import com.springhrms.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User findByUserName(String username) {
		return (User) sessionFactory.getCurrentSession().get(User.class, username);
	}

}
