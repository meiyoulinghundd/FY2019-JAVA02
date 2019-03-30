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
	       System.out.println("*********选择要操作的数字*************");
	       System.out.println("*1查看学生信息  ------ 2添加学生信息----3删除学生信息---4修改学生信息---5退出*");
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
		System.out.println("-----1根据id修改全部信息--------2根据id修改部分学生信息---3返回上一级---4系统退出");
		Scanner s=new Scanner(System.in);
	    System.out.println("*********选择要操作的数字*************");
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
		System.out.println("====欢迎访问学生管理系统===");
		Scanner s=new Scanner(System.in);
		System.out.println("====请输入 1:登录 2:退出===");
        int num=s.nextInt();
		
		if(num==1) {//登录
			
			try {
				
				userView.login();
				
				app.cx();
				
				
			} catch (LoginException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();//打印堆栈信息
				
				String msg=e.getMessage();
				System.out.println(msg);
				
				app.choise();
			}
			
		}else  if(num==2){

			
		}
		else {
			
			System.out.println("无效的输入");
		}
		
		
		
		
		
		
	}
	

	
	
	
	
}
