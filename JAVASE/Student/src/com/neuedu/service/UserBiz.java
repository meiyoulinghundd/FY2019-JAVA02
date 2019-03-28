package com.neuedu.service;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;

public interface UserBiz {

	      void register(String username, String password, String password2,
			String name, String email)
					throws RegisterException;//用户注册
			void login(String username, String password) //用户登录
					throws LoginException;
			
	/*
	 * 判断用户名是否存在
	 * @param username 用户名
	 * @return boolean true:用户名存在 false:不存在
	 * */
	 boolean isusernameexists(String username)throws LoginException;		
	
}
