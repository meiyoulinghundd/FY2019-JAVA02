package com.neuedu.view.impl;

import java.util.Scanner;

import com.neuedu.pojo.Student;
import com.neuedu.exception.LoginException;
import com.neuedu.exception.addException;
import com.neuedu.service.UserBiz;
import com.neuedu.service.impl.UserBizImpl;
import com.neuedu.view.UserView;

/**
 * ������û��������ռ��û�������Ϣ
 * */
public class UserViewImpl implements UserView {

	
	@Override
	public void login() throws LoginException{
		// TODO Auto-generated method stub
		
		//���ܼ��������ȡusername,password
		UserBiz userBiz=new UserBizImpl();
		Scanner s=new Scanner(System.in);
		
		System.out.print("�������û���:");
		String username=s.next();
			System.out.print("����������:");
			String password=s.next();
			userBiz.login(username, password);
		}

	
	
   
	
}
