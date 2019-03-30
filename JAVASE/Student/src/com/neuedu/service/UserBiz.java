package com.neuedu.service;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.addException;
import com.neuedu.pojo.Student;


public interface UserBiz {

	     
		
			void login(String username, String password) //用户登录
					throws LoginException;
			
            void  add() throws  addException; //
			void see();//用户查看
			boolean isidexists(int _id) throws  addException;
			boolean isidsc(int _id) throws addException ;
			void sdelete() throws addException;//用户删除

			void update() throws addException;

			void update1() throws addException;

		


			
		
	
}
