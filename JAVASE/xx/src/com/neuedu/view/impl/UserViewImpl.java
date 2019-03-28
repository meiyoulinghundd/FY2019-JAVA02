package com.neuedu.view.impl;

import java.util.Scanner;

import com.neuedu.Application;
import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;
import com.neuedu.service.UserBiz;
import com.neuedu.service.impl.UserBizImpl;
import com.neuedu.view.UserView;
/**
 * ������û��������ռ��û�������Ϣ
 * */
public class UserViewImpl implements UserView {
      
	UserBiz userBiz=new UserBizImpl();
	Application  app1= new Application();
	@Override
	public void login()  throws LoginException {//���ܼ��������ȡusername,password
		// TODO Auto-generated method stub
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
	public void register()  throws  RegisterException{
		// TODO Auto-generated method stub
	
		Scanner s=new Scanner(System.in);
		  System.out.println("�������û���");
		  String username=s.nextLine();
		  
		
		
		boolean   ss=userBiz.Testusername1(username); 
			if(ss) {
		 
		  System.out.println("����������");
		  String password=s.nextLine();
		  
		  boolean aa=userBiz.Testpassword2(password);
		  if (aa) {
		  System.out.println("���ظ�����");
		  String password2=s.nextLine();
		  boolean aaa=userBiz.Testpassword(password,password2);
		  if(aaa) {
		  System.out.println("��������ʵ����");
		  String name=s.nextLine();
		  System.out.println("�������������ַ");
		  String email=s.nextLine();
		 
		userBiz.register(username, password, password2, name, email);
	}
		  }
		  }
			else {}
	}
}
