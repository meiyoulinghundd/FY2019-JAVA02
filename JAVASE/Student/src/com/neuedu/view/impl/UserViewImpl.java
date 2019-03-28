package com.neuedu.view.impl;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.service.UserBiz;
import com.neuedu.service.impl.UserBizImpl;
import com.neuedu.view.UserView;
/**
 * ������û��������ռ��û�������Ϣ
 * */
public class UserViewImpl implements UserView {

	UserBiz userBiz=new UserBizImpl();
	@Override
	public void login() throws LoginException{
		// TODO Auto-generated method stub
		
		//���ܼ��������ȡusername,password
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("�������û���:");
		String username=s.next();
		
		
		
		boolean usernameexists=userBiz.isusernameexists(username);
		if(usernameexists) {
			System.out.print("����������:");
			String password=s.next();
			userBiz.login(username, password);
		}
		
		
		
		
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
		
	
		//userBiz.register(username, password, password2, name, email);
		
	}
  
	
}
