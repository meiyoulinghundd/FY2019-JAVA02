package com.neuedu.service;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.addException;
import com.neuedu.pojo.Student;


public interface UserBiz {

	     
		
			void login(String username, String password) //�û���¼
					throws LoginException;
			
            void  add() throws  addException; //
			void see();//�û��鿴
			boolean isidexists(int _id) throws  addException;
			boolean isidsc(int _id) throws addException ;
			void sdelete() throws addException;//�û�ɾ��

			void update() throws addException;

			void update1() throws addException;

		


			
		
	
}
