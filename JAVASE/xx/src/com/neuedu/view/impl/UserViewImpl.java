package com.neuedu.view.impl;

import java.util.Scanner;

import com.neuedu.Application;
import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;
import com.neuedu.service.UserBiz;
import com.neuedu.service.impl.UserBizImpl;
import com.neuedu.view.UserView;
/**
 * 负责根用户交互，收集用户输入信息
 * */
public class UserViewImpl implements UserView {
      
	UserBiz userBiz=new UserBizImpl();
	Application  app1= new Application();
	@Override
	public void login()  throws LoginException {//接受键盘输入获取username,password
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
		System.out.print("请输入用户名:");
		String username=s.next();
		  
	
		
		boolean usernameexists=userBiz.isusernameexists(username);
		if(usernameexists) {
			System.out.print("请输入密码:");
			String password=s.next();
			userBiz.login(username, password);
		}
	}

	@Override
	public void register()  throws  RegisterException{
		// TODO Auto-generated method stub
	
		Scanner s=new Scanner(System.in);
		  System.out.println("请输入用户名");
		  String username=s.nextLine();
		  
		
		
		boolean   ss=userBiz.Testusername1(username); 
			if(ss) {
		 
		  System.out.println("请输入密码");
		  String password=s.nextLine();
		  
		  boolean aa=userBiz.Testpassword2(password);
		  if (aa) {
		  System.out.println("请重复密码");
		  String password2=s.nextLine();
		  boolean aaa=userBiz.Testpassword(password,password2);
		  if(aaa) {
		  System.out.println("请输入真实姓名");
		  String name=s.nextLine();
		  System.out.println("请读入电子邮箱地址");
		  String email=s.nextLine();
		 
		userBiz.register(username, password, password2, name, email);
	}
		  }
		  }
			else {}
	}
}
