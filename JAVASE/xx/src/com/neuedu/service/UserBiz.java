package com.neuedu.service;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;

public interface UserBiz {
	  void register(String username, String password, String password2,String name, String email)
			  throws RegisterException; //用户注册
		 void login(String username, String password) 
				 throws LoginException ;//用户登录
		boolean isusernameexists(String username) throws LoginException;

		
		boolean Testpassword2(String password)throws RegisterException;
		boolean Testpassword(String passowrd1,String password2)throws RegisterException;
		boolean Testusername1(String username) throws RegisterException;
	

		
		 
		 
			/*
			 * 判断用户名是否存在
			 * @param username 用户名
			 * @return boolean true:用户名存在 false:不存在
			 * */
		 
		 
}
