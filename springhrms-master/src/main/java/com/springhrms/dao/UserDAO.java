package com.springhrms.dao;

import com.springhrms.model.User;

/**
 *
 * @author Manish gour
 */
public interface UserDAO {

	public User findByUserName(String username);

}
