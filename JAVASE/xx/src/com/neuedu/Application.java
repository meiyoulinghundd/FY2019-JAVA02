package com.neuedu;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;
import com.neuedu.view.UserView;
import com.neuedu.view.impl.UserViewImpl;

public class Application {
	
	
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
    	  UserView userView=new UserViewImpl();
				userView.login();
			} catch (LoginException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();//打印堆栈信息
				
				String msg=e.getMessage();
				System.out.print(msg);
				 choise();
			}
		} else if (num==2)  {
			try {
				 UserView userView=new UserViewImpl();
				userView.register();
			}	  catch(RegisterException  q)		{
				
				String qb=q.getMessage();
				System.out.print(qb);
			}
			choise();
		}else {
				System.out.println("输入有误，请重新输入");
				choise();
			}
			
		}
	}


