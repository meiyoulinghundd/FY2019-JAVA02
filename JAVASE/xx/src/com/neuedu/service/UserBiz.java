package com.neuedu.service;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;

public interface UserBiz {
	  void register(String username, String password, String password2,String name, String email)
			  throws RegisterException; //�û�ע��
		 void login(String username, String password) 
				 throws LoginException ;//�û���¼
		boolean isusernameexists(String username) throws LoginException;

		
		boolean Testpassword2(String password)throws RegisterException;
		boolean Testpassword(String passowrd1,String password2)throws RegisterException;
		boolean Testusername1(String username) throws RegisterException;
	

		
		 
		 
			/*
			 * �ж��û����Ƿ����
			 * @param username �û���
			 * @return boolean true:�û������� false:������
			 * */
		 
		 
}
