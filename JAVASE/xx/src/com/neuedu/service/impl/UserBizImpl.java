package com.neuedu.service.impl;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;
import com.neuedu.pojo.User;
import com.neuedu.service.UserBiz;
import com.sun.org.apache.regexp.internal.RESyntaxException;

public class UserBizImpl  implements UserBiz  {

	//����user��������
	
	private User[]   users = new User[10];
	 public UserBizImpl() {
		 
		 User  user1 =new User( "admin","admin","Administrator","admin@123.com");
		 User user2=new User("tom","cat","tomcat","tomcat@123.com");
		 this.users[1]= user1;
		 this.users[2]= user2;
		 
		 
	 }
	
	
	@Override
	public void register(String username, String password, String password2, String name, String email)
			throws RegisterException {
		// TODO Auto-generated method stub
		
		boolean   username1= false;//Ĭ���û���������
		for(int i=0;i<users.length;i++) {
			
			User user=users[i];
			if(user==null) {
				continue;
			}
			String _username=user.getUsername();
			if(_username.equals(username)) {
				
				username1=true;
				throw new RegisterException("�û����Ѵ���");
			}  else {
				
				
			}
		}
		
		
		
	}

	@Override
	public void login(String username, String password) throws LoginException {
		// TODO Auto-generated method stub
		//username ������
			//2�� username ��password ��ƥ��
				
			//step1:����users����
		boolean usernameexists = false;//Ĭ���û���������
		
        for(int i=0;i<users.length;i++) {
			
			User user=users[i];
			if(user==null) {
				continue;
			}
			
			String _username=user.getUsername();
			String _password=user.getPassword();
			if(_username.equals(username))
			{//�û�������
				usernameexists=true;
				
				if(password.equals(_password)) 
				{//��¼�ɹ�
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
	

  public boolean username1(String username) throws RegisterException {
	
		
	for(int i=0;i<users.length;i++) {
			
			User user=users[i];
	  
			if(user==null) {
				continue;
			}
			String _username=user.getUsername();
			if(!_username.equals(username)) {//�û�������
				
				   return true;
				}
	
	}
	 throw new RegisterException("�û����Ѵ���");
}
}
	

