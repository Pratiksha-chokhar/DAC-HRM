package com.springhrms.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springhrms.dao.UserDAO;
import com.springhrms.model.UserRole;
import com.springhrms.service.AuthenticationService;

@Service("authenticationService")
public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	private UserDAO userDAO;

	private static final Logger logger = LoggerFactory.getLogger(AuthenticationServiceImpl.class);

	@Override
	@Transactional
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
		logger.info("AuthenticationServiceImpl loadUserByUsername executed");
		com.springhrms.model.User user = userDAO.findByUserName(username);

		List<GrantedAuthority> authorities = buildUserAuthority(user.getUserRole());

		/*
		 * Converts com.springhrms.model.User user to
		 * org.springframework.security.core.userdetails.User
		 */
		return new User(user.getUsername(), user.getPassword(), user.isEnabled(), true, true, true, authorities);

	}

	private List<GrantedAuthority> buildUserAuthority(Set<UserRole> userRoles) {

		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();

		// Build user's authorities
		for (UserRole userRole : userRoles) {
			setAuths.add(new SimpleGrantedAuthority(userRole.getRole()));
		}

		List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);

		return Result;
	}
}
