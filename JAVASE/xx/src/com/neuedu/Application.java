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
		
		System.out.println("====��ӭ���ʼƷ�ϵͳ===");
		Scanner s =new Scanner(System.in);
		System.out.println("====������ 1:��¼ 2:ע��===");
		int  num=s.nextInt();
		
		if(num==1) {
         try {
    	  UserView userView=new UserViewImpl();
				userView.login();
			} catch (LoginException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();//��ӡ��ջ��Ϣ
				
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
				System.out.println("������������������");
				choise();
			}
			
		}
	}


