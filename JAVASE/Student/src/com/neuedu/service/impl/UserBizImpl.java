package com.neuedu.service.impl;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;
import com.neuedu.pojo.User;
import com.neuedu.service.UserBiz;

public class UserBizImpl implements UserBiz {

	//����user��������
	private User[] users=new User[10];
	
	public UserBizImpl() {
		//admin  admin Administrator   admin@123.com
		User user1=new User( "admin","admin");
		
		
		this.users[0]=user1;
	
		
	}
	
	@Override
	public void register(String username, String password, String password2, String name, String email)
			throws RegisterException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(String username, String password) throws LoginException {
		// TODO Auto-generated method stub
		
		//username ������
		//2�� username ��password ��ƥ��
		
		//step1:����users����
		boolean usernameexists=false;//Ĭ���û���������
		for(int i=0;i<users.length;i++) {
			
			User user=users[i];
			if(user==null) {
				continue;
			}
			
			String _username=user.getUsername();
			String _password=user.getPassword();
			if(_username.equals(username)) {//�û�������
				usernameexists=true;
				
				if(password.equals(_password)) {//��¼�ɹ�
					System.out.println("��¼�ɹ�!!!");
				}else {//username ��password ��ƥ��
					throw new LoginException("�û��������벻ƥ��"); 
				}
			}
			
		}
		
		
		
		
		if(!usernameexists) {//�û���������
			
			throw new LoginException("�û���������");
		}
		
		
		
		
		
	}

	@Override
	public boolean isusernameexists(String username) throws LoginException {
		// TODO Auto-generated method stub
		
		
	for(int i=0;i<users.length;i++) {
			
			User user=users[i];
			if(user==null) {
				continue;
			}
			
			String _username=user.getUsername();
			
			if(_username.equals(username)) {//�û�������
				
			   return true;
			}
			
		}
		
		 throw new LoginException("�û���������");
		
	}

	
}
