package com.neuedu.view.impl;

import java.util.Scanner;

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
		  
		
		
		boolean username1=userBiz.username1(username); 
			if(username1) {
		  String username=s.next();
		  System.out.println("����������");
		  String password=s.next();
		  System.out.println("���ظ�����");
		  String password2=s.next();
		  System.out.println("��������ʵ����");
		  String name=s.next();
		  System.out.println("�������������ַ");
		  String email=s.next();
		 
		userBiz.register(username, password, password2, name, email);
	}
	}
}
