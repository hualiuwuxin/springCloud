package com.smt.controller;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
	
	@RequestMapping("get")
	public User getUserById(){

		return userService.getUserById( 1L );
		
	}
	@RequestMapping("update")
	public User update(){
		
		/*ExecutorService executor = 	Executors.newCachedThreadPool();
		for( int i = 0;i< 100;i++ ) {
			executor.submit( ()->{ userService.update( 1L ); } );
		}*/
		
		return userService.update( 1L );
	}
	
	@RequestMapping("insert")
	public User insert(){
		
		/*ExecutorService executor = 	Executors.newCachedThreadPool();
		for( int i = 0;i< 100;i++ ) {
			executor.submit( ()->{ userService.update( 1L ); } );
		}*/
		
		return userService.insert( 1L );
	}
	
	
	
}
