package com.smt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smt.bean.User;
import com.smt.dao.UserMapper;
import com.smt.service.UserService;

@Service
public class UserServiceimpl implements UserService {
	
	@Autowired
	UserMapper userMapper;
	
	@Override
	public User getUserById(long l) {
		
		
		User user = userMapper.selectByPrimaryKey( 1L );
		return user;
	}

}
