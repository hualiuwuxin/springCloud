package com.smt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smt.bean.User;
import com.smt.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("getUserById")
	public User getUserById(){

		return userService.getUserById( 1L );
		
	}
	
	
}
