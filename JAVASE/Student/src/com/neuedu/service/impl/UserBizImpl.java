package com.neuedu.service.impl;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.addException;
import com.neuedu.pojo.Student;
import com.neuedu.pojo.User;
import com.neuedu.service.UserBiz;

public class UserBizImpl implements UserBiz {
	
	//创建user类型数组
	private User[] users=new User[10];
    private Student[] students=new Student[10];
	
	public UserBizImpl() {
		//admin  admin Administrator   admin@123.com
		User user1=new User( "admin","admin");
		Student student1=new Student(1,"张三","男",17,"152班","sads",154245,"sasa"  );
		Student student2=new Student(2,"张四","男",18,"152班","sads",154245,"sasa"  );
		this.users[0]=user1;
	    this.students[0]=student1;
	    this.students[1]=student2;
		
	}
	



	@Override
	public void login(String username, String password) throws LoginException {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<users.length;i++) {
			
			User user=users[i];
			if(user==null) {
				continue;
			}
			
			String _username=user.getUsername();
			String _password=user.getPassword();
			if(_username.equals(username)&&password.equals(_password)) {//用户名存在
			             System.out.println("---------管理员界面---------");
				
				}else {//username 和password 不匹配
					throw new LoginException("用户名与密码不匹配"); 
				
				}
			}	
	}

	
	
	
	  public boolean isidexists(int _id) throws addException{
		
		  for(int i=0;i<students.length;i++) {
			  
			  Student  st =students[i];
			  if( st==null) {
				  continue;
			  }
			  int id=st.getId();
			  if( id==_id) {
					throw new addException("您输入的用户名已存在");
			  }
			  
		  }
		  
		  
		  return true;
		  
		  
		  
		  
	  }

	  public boolean isidsc(int _id) throws addException{
			
		  for(int i=0;i<students.length;i++) {
			  
			  Student  st =students[i];
			  if( st==null) {
				  continue;
			  }
			  int id=st.getId();
			  if( id==_id) {
				  return true;
					
			  }
			  
		  }
		  
			throw new addException("您输入的id不存在");
	  
	  }
	

	  public void add() throws   addException{
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			
			System.out.print("请输入id:");
			  int  _id=s.nextInt();
			   
			  boolean idexists=isidexists(_id);
			  if( idexists) {
				  
				  System.out.print("请输入姓名:");
			
				  String _name=s.next();
				  System.out.print("请输入性别:");
				  String _sex=s.next();
				  System.out.print("请输入年龄:");
				  int  _age=s.nextInt();
				  System.out.print("请输入年级:");
				  String __class=s.next();
				  System.out.print("请输入地址:");
				  String _address=s.next();
				  System.out.print("请输入联系方式:");
				  int  _phone=s.nextInt();
				  System.out.print("请输入邮箱:");
				  String _email=s.next();
				  Student  st =new Student(_id, _name, _sex, _age, __class, _address, _phone, _email);
				  
				 students[_id-1]=st;
			/*	  for(int i=0;i<students.length;i++) {
					  if(students[i]==null) {continue;}
					  Student student =students[i];
					 System.out.println(  student.getId()+student.getName());
					  
					  
				  }
				  */
				  
				 System.out.println("添加成功");
			
			  }
			  
			  
			
			
		}
	  
	  
	  public void update() throws addException {
		  Scanner s=new Scanner(System.in);
			
			System.out.print("请输入id:");
			  int  _id=s.nextInt();
			  boolean bb=isidsc(_id);
			  if( bb) {
				  Student student =students[_id-1];
				  System.out.println("学生id   学生姓名      学生性别    学生年龄     学生班级      学生电话    学生地址");
				  System.out.println(student.getId()+"        "+student.getName()+"               "+student.getSex()+"              "+student.getAge()+"    "+student.get_class()+"         "+student.getPhone()+"      "+student.getAddress() );
				  System.out.print("请输入姓名:");
				  student.setName(s.next());
				 
				  System.out.print("请输入性别:");
				  student.setSex(s.next());
				
				  System.out.print("请输入年龄:");
			      student.setAge(s.nextInt());
				  System.out.print("请输入年级:");
				  student.set_class(s.next());
				  System.out.print("请输入地址:");
				  student.setAddress(s.next());
				  System.out.print("请输入联系方式:");
			      student.setPhone(s.nextInt());
				  System.out.print("请输入邮箱:");
				  student.setEmail(s.next());
				  System.out.println("修改成功");
			  }
	  }
	  public  void update1() throws addException {
		  Scanner s=new Scanner(System.in);
			
			System.out.print("请输入id:");
			  int  _id=s.nextInt();
			  boolean aa=isidsc(_id);
			  if( aa) {
				  Student student =students[_id-1];
				  System.out.println("学生id   学生姓名      学生性别    学生年龄     学生班级      学生电话    学生地址");
				  System.out.println(student.getId()+"        "+student.getName()+"               "+student.getSex()+"              "+student.getAge()+"    "+student.get_class()+"         "+student.getPhone()+"      "+student.getAddress() );
				  System.out.print("请输入修改的属性:");
				  String sc=s.next();
				  System.out.print("请输入修改的数值:");
				  String sd=s.next();
				  if(sc.equals("name")) {
					  student.setName(sd);
				  } else  if(sc.equals("name")) {
					  student.setName(sd);
				  }else  if(sc.equals("sex")) {
					  student.setSex(sd);
				  }else  if(sc.equals("age")) {
					  int q= Integer.parseInt(sd);
					  student.setAge(  q  );
				  }else  if(sc.equals("class")) {
					  student.set_class(sd);
				  }else  if(sc.equals("phone")) {
					  student.setPhone(Integer.parseInt(sd));
				  }else  if(sc.equals("address")) {
					  student.setAddress(sd);
				  }
			  }
			  System.out.println("修改成功");
		  
	  }
	


public void see() {//查看学生信息
	   System.out.println("学生id   学生姓名      学生性别    学生年龄     学生班级      学生电话    学生地址");	
    for(int i=0;i<students.length;i++){
   	 Student student =students[i];
   	 if(student==null) {
   		continue;
   	 }else {
   	 
   	System.out.println(student.getId()+"        "+student.getName()+"               "+student.getSex()+"              "+student.getAge()+"    "+student.get_class()+"         "+student.getPhone()+"      "+student.getAddress() );	 
   		 
  /* System.out.println("学生id："+student.getId());
   System.out.println("学生姓名："+student.getName());
   System.out.println("学生性别："+student.getSex());
  System.out.println("学生年龄："+student.getAge());
  System.out.println("学生班级："+student.get_class());
  System.out.println("学生电话："+student.getPhone());
  System.out.println("学生地址:"+student.getAddress());*/
   	 }
   	 }

 
}





public void sdelete() throws addException {
	// TODO Auto-generated method stub
	
			Scanner s=new Scanner(System.in);
			System.out.println("请输入要删除的id");
			int _id= s.nextInt();
			boolean idsc=isidsc(_id);
			if( idsc) {
				for(int i=0;i<students.length;i++) {
					if(students[i]==null) {
						continue;
					}
					int id= students[i].getId();
					if(id==_id) {
						
						students[i]=null;
					}
					
				}
				System.out.println("删除成功");
			}
	
}



	}
	
/*int id, String name, String sex, int age, String _class, String address, int phone, String email
*/