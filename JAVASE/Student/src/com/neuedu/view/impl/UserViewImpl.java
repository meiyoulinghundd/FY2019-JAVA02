package com.neuedu.view.impl;

import java.util.Scanner;

import com.neuedu.pojo.Student;
import com.neuedu.exception.LoginException;
import com.neuedu.exception.addException;
import com.neuedu.service.UserBiz;
import com.neuedu.service.impl.UserBizImpl;
import com.neuedu.view.UserView;

/**
 * 负责根用户交互，收集用户输入信息
 * */
public class UserViewImpl implements UserView {

	
	@Override
	public void login() throws LoginException{
		// TODO Auto-generated method stub
		
		//接受键盘输入获取username,password
		UserBiz userBiz=new UserBizImpl();
		Scanner s=new Scanner(System.in);
		
		System.out.print("请输入用户名:");
		String username=s.next();
			System.out.print("请输入密码:");
			String password=s.next();
			userBiz.login(username, password);
		}

	
	
   
	
}
