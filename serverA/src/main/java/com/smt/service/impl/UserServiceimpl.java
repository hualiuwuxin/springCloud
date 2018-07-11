package com.smt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smt.bean.User;
import com.smt.service.UserService;
import com.smt.service.dao.UserMapper;

@Service
public class UserServiceimpl implements UserService {
	
	@Autowired
	UserMapper userMapper;
	
	@Override
	public User getUserById(long l) {
		
		
		User user = userMapper.selectByPrimaryKey( 1L );
		user.setId(1L);
		user.setName("admin");
		return user;
	}

}
