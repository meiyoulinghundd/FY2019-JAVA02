package com.neuedu;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Manager{
		public String username;
		public String password;
		public String name;
		public String email;
		
		public Manager(String username,String password,String name,String email){
			this.username = username;
			this.password = password;
			this.name = name;
			this.email= email;
			
			
		}
		public String getUsername(){
			return username;
		}
		public void setUsername(String username){
			this.username = username;
		}
		public String getPassword(){
			return password;
		}
		public void setPassword(String password){
			this.password = password; 
		}
		public String getName(){
			return name;
		}
		public void setName(String name){
			this.name = name; 
		}
		public void setEmail(String email){
			this.email = email; 
		}
		public String getEmail(){
			return email;
		}
		
		
		
	}
	
public interface UserBiz{
	
	
	  void register(String username, String password, String password2,String name, String email) throws RegisterException; //用户注册
		 void login(String username, String password) throws LoginException ;//用户登录
}


     class  User1 extends User implements


}
