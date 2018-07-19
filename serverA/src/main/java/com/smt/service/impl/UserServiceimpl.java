package com.smt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smt.bean.User;
import com.smt.dao.UserMapper;
import com.smt.service.UserService;

@Service
public class UserServiceimpl implements UserService {
	
	@Autowired
	UserMapper userMapper;
	
	@Override
	@Transactional(readOnly=true)
	public User getUserById(long id) {
		for( int i = 0;i<10;i++ ) {
			System.out.println( userMapper.selectByExample(null).size() );
			//System.out.println( userMapper.selectByPrimaryKey(1L).getAge() );
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	@Transactional
	public User update(long l) {
		User user = userMapper.selectByPrimaryKey( 1L );
		user.setAge(  user.getAge() + 1 );
		System.out.println( "Ç°" );
		userMapper.up(user);
		System.out.println( "ºó" );
		System.out.println( "ºó1" );
		return user;
	}

	@Override
	@Transactional
	public User insert(long l) {
		User user = new User();
		user.setName("a");
		user.setAge(1);
		user.setVersion(1);
		userMapper.insert(user);
		return null;
	}

}
