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
		
		System.out.println("====欢迎访问计费系统===");
		Scanner s =new Scanner(System.in);
		System.out.println("====请输入 1:登录 2:注册===");
		int  num=s.nextInt();
		
		if(num==1) {
      try {
				
				userView.login();
			} catch (LoginException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();//打印堆栈信息
				
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
