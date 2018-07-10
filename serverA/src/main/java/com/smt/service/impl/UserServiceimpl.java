package com.smt.service.impl;

import org.springframework.stereotype.Service;

import com.smt.bean.User;
import com.smt.service.UserService;

@Service
public class UserServiceimpl implements UserService {

	@Override
	public User getUserById(long l) {
		User user = new User();
		user.setId(1L);
		user.setName("admin");
		return user;
	}

}
