package com.neuedu;
import java.util.Scanner;
public class User {

	public String username;
	public String password;
	public String name;
	public String email;
	
	
	public User(String username,String password,String name,String email){
		this.username = username;
		this.password = password;
		this.name = name;
		this.email= email;
		
		
	}
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

*/
		
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
		

