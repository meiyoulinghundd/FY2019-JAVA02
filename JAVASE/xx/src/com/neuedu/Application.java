package com.neuedu;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;
import com.neuedu.view.UserView;
import com.neuedu.view.impl.UserViewImpl;

public class Application {
	UserView userView=new UserViewImpl();
	public static void main(String[] args) {
		
		Application  app= new Application();
		 app.choise ();
		// TODO Auto-generated method stub

	}

	
	public  void  choise () {
		
		System.out.println("====��ӭ���ʼƷ�ϵͳ===");
		Scanner s =new Scanner(System.in);
		System.out.println("====������ 1:��¼ 2:ע��===");
		int  num=s.nextInt();
		
		if(num==1) {
      try {
				
				userView.login();
			} catch (LoginException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();//��ӡ��ջ��Ϣ
				
				String msg=e.getMessage();
				System.out.print(msg);
				
			}
		} else if (num==2)  {
			try {
			userView.register();
			}	  catch(RegisterException  e )		{
				
				String msg=e.getMessage();
				System.out.print(msg);
			}
			
			
		}
	}


}
