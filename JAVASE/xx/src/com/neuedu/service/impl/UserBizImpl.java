package com.neuedu.service.impl;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;
import com.neuedu.pojo.User;
import com.neuedu.service.UserBiz;
import com.sun.org.apache.regexp.internal.RESyntaxException;

public class UserBizImpl  implements UserBiz  {

	//创建user类型数组
	
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
		User user1 = new User();
		user1.username=username;
		user1.password=password;
		user1.name=name;
		user1.email=email;
		for(int i = 0;i<users.length;i++) {
			User user = users[i];
			if(user == null) {
				user=user1;
				
			}
		System.out.println(user.name);
	}
	System.out.println("注册成功！");
}
		
		


	@Override
	public void login(String username, String password) throws LoginException {
		// TODO Auto-generated method stub
		//username 不存在
			//2） username 和password 不匹配
				
			//step1:遍历users数组
		boolean usernameexists = false;//默认用户名不存在
		
        for(int i=0;i<users.length;i++) {
			
			User user=users[i];
			if(user==null) {
				continue;
			}
			
			String _username=user.getUsername();
			String _password=user.getPassword();
			if(_username.equals(username))
			{//用户名存在
				usernameexists=true;
				
				if(password.equals(_password)) 
				{//登录成功
					System.out.println("登录成功!!!");
				}else {//username 和password 不匹配
					throw new LoginException("用户名与密码不匹配"); 
				}
			}
        }
             if(!usernameexists) {//用户名不存在
	
	throw new LoginException("用户名不存在");
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
			
			if(_username.equals(username)) {//用户名存在
				
			   return true;
			}
			
		}
		
		 throw new LoginException("用户名不存在");
		
	}
	public boolean Testusername1(String username) throws RegisterException{
		for(int i =0;i<users.length;i++) {
			User user =users[i];
			
			if(user==null) {
				continue;
			}
			String _username=user.getUsername();
			if(_username.equals(username)) {
				throw new RegisterException("您输入的用户名已存在");
				
			}
			
		}
		return true;	
	}


	@Override
	public boolean Testpassword2(String password) throws RegisterException {
		// TODO Auto-generated method stub
		if(password.length()==0) {
			throw new RegisterException("密码不能为空");
			
		}else {
			return true;
		}
		
	}
	
	



	@Override
	public boolean Testpassword(String passowrd1, String password2) throws RegisterException {
		// TODO Auto-generated method stub
		if(passowrd1.equals(password2)) {
			return true;
		}
		throw new RegisterException("密码不一致");
	}



}

