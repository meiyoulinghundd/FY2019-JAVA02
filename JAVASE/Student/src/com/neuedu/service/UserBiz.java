package com.neuedu.service;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;

public interface UserBiz {

	      void register(String username, String password, String password2,
			String name, String email)
					throws RegisterException;//�û�ע��
			void login(String username, String password) //�û���¼
					throws LoginException;
			
	/*
	 * �ж��û����Ƿ����
	 * @param username �û���
	 * @return boolean true:�û������� false:������
	 * */
	 boolean isusernameexists(String username)throws LoginException;		
	
}
