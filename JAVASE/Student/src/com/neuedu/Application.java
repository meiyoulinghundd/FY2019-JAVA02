package com.neuedu;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.addException;
import com.neuedu.service.UserBiz;
import com.neuedu.service.impl.UserBizImpl;
import com.neuedu.view.UserView;
import com.neuedu.view.impl.UserViewImpl;

public class Application {

	 UserView userView=new UserViewImpl();
	 UserBiz userBiz=new UserBizImpl();
	 
	
	public static void main(String[]args) {
		 //step1: 
		Application app=new Application();
		
		app.choise();
	}
	
	
	public void cx() {
		
		 
	       Scanner s=new Scanner(System.in);
	       System.out.println("*********ѡ��Ҫ����������*************");
	       System.out.println("*1�鿴ѧ����Ϣ  ------ 2���ѧ����Ϣ----3ɾ��ѧ����Ϣ---4�޸�ѧ����Ϣ---5�˳�*");
	       int num=s.nextInt();
	     
	       if(num==1) {
	    	    userBiz.see();
	    	    cx();
	    	   
	       }else if(num==2) {
	    	
			
			try {
				userBiz.add();
				cx();
			} catch (addException e) {
				// TODO Auto-generated catch block
				String msg=e.getMessage();
				System.out.print(msg);
				cx();
			}
	    	   
	       } else if(num==3) {
	    	   
	    	   try {
				userBiz.sdelete();
				cx();
			} catch (addException e) {
				// TODO Auto-generated catch block
				String msg=e.getMessage();
				System.out.print(msg);
				cx();
			}
	       }else if(num==4) {
	    	   
	    	  up();
	       }
		
	}
	
	public void up() {
		System.out.println("-----1����id�޸�ȫ����Ϣ--------2����id�޸Ĳ���ѧ����Ϣ---3������һ��---4ϵͳ�˳�");
		Scanner s=new Scanner(System.in);
	    System.out.println("*********ѡ��Ҫ����������*************");
	    int num=s.nextInt();
	    if(num==1) {
	    	try {
				userBiz.update();
				up();
			} catch (addException e) {
				// TODO Auto-generated catch block
				String msg=e.getMessage();
				System.out.print(msg);
				up();
			}
	    }else if(num==3) {
	    	   cx();
	    }else if(num==2){
	    	  try {
				userBiz.update1();
				up();
			} catch (addException e) {
				// TODO Auto-generated catch block
				String msg=e.getMessage();
				System.out.print(msg);
				up();
			}
	    	  
	    	
	    }else if(num==4) {
	    	
	    }
	    
	}

	public void  choise() {
		 Application app=new Application();
		System.out.println("====��ӭ����ѧ������ϵͳ===");
		Scanner s=new Scanner(System.in);
		System.out.println("====������ 1:��¼ 2:�˳�===");
        int num=s.nextInt();
		
		if(num==1) {//��¼
			
			try {
				
				userView.login();
				
				app.cx();
				
				
			} catch (LoginException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();//��ӡ��ջ��Ϣ
				
				String msg=e.getMessage();
				System.out.println(msg);
				
				app.choise();
			}
			
		}else  if(num==2){

			
		}
		else {
			
			System.out.println("��Ч������");
		}
		
		
		
		
		
		
	}
	

	
	
	
	
}
