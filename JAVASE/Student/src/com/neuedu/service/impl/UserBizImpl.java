package com.neuedu.service.impl;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.addException;
import com.neuedu.pojo.Student;
import com.neuedu.pojo.User;
import com.neuedu.service.UserBiz;

public class UserBizImpl implements UserBiz {
	
	//����user��������
	private User[] users=new User[10];
    private Student[] students=new Student[10];
	
	public UserBizImpl() {
		//admin  admin Administrator   admin@123.com
		User user1=new User( "admin","admin");
		Student student1=new Student(1,"����","��",17,"152��","sads",154245,"sasa"  );
		Student student2=new Student(2,"����","��",18,"152��","sads",154245,"sasa"  );
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
			if(_username.equals(username)&&password.equals(_password)) {//�û�������
			             System.out.println("---------����Ա����---------");
				
				}else {//username ��password ��ƥ��
					throw new LoginException("�û��������벻ƥ��"); 
				
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
					throw new addException("��������û����Ѵ���");
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
		  
			throw new addException("�������id������");
	  
	  }
	

	  public void add() throws   addException{
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			
			System.out.print("������id:");
			  int  _id=s.nextInt();
			   
			  boolean idexists=isidexists(_id);
			  if( idexists) {
				  
				  System.out.print("����������:");
			
				  String _name=s.next();
				  System.out.print("�������Ա�:");
				  String _sex=s.next();
				  System.out.print("����������:");
				  int  _age=s.nextInt();
				  System.out.print("�������꼶:");
				  String __class=s.next();
				  System.out.print("�������ַ:");
				  String _address=s.next();
				  System.out.print("��������ϵ��ʽ:");
				  int  _phone=s.nextInt();
				  System.out.print("����������:");
				  String _email=s.next();
				  Student  st =new Student(_id, _name, _sex, _age, __class, _address, _phone, _email);
				  
				 students[_id-1]=st;
			/*	  for(int i=0;i<students.length;i++) {
					  if(students[i]==null) {continue;}
					  Student student =students[i];
					 System.out.println(  student.getId()+student.getName());
					  
					  
				  }
				  */
				  
				 System.out.println("��ӳɹ�");
			
			  }
			  
			  
			
			
		}
	  
	  
	  public void update() throws addException {
		  Scanner s=new Scanner(System.in);
			
			System.out.print("������id:");
			  int  _id=s.nextInt();
			  boolean bb=isidsc(_id);
			  if( bb) {
				  Student student =students[_id-1];
				  System.out.println("ѧ��id   ѧ������      ѧ���Ա�    ѧ������     ѧ���༶      ѧ���绰    ѧ����ַ");
				  System.out.println(student.getId()+"        "+student.getName()+"               "+student.getSex()+"              "+student.getAge()+"    "+student.get_class()+"         "+student.getPhone()+"      "+student.getAddress() );
				  System.out.print("����������:");
				  student.setName(s.next());
				 
				  System.out.print("�������Ա�:");
				  student.setSex(s.next());
				
				  System.out.print("����������:");
			      student.setAge(s.nextInt());
				  System.out.print("�������꼶:");
				  student.set_class(s.next());
				  System.out.print("�������ַ:");
				  student.setAddress(s.next());
				  System.out.print("��������ϵ��ʽ:");
			      student.setPhone(s.nextInt());
				  System.out.print("����������:");
				  student.setEmail(s.next());
				  System.out.println("�޸ĳɹ�");
			  }
	  }
	  public  void update1() throws addException {
		  Scanner s=new Scanner(System.in);
			
			System.out.print("������id:");
			  int  _id=s.nextInt();
			  boolean aa=isidsc(_id);
			  if( aa) {
				  Student student =students[_id-1];
				  System.out.println("ѧ��id   ѧ������      ѧ���Ա�    ѧ������     ѧ���༶      ѧ���绰    ѧ����ַ");
				  System.out.println(student.getId()+"        "+student.getName()+"               "+student.getSex()+"              "+student.getAge()+"    "+student.get_class()+"         "+student.getPhone()+"      "+student.getAddress() );
				  System.out.print("�������޸ĵ�����:");
				  String sc=s.next();
				  System.out.print("�������޸ĵ���ֵ:");
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
			  System.out.println("�޸ĳɹ�");
		  
	  }
	


public void see() {//�鿴ѧ����Ϣ
	   System.out.println("ѧ��id   ѧ������      ѧ���Ա�    ѧ������     ѧ���༶      ѧ���绰    ѧ����ַ");	
    for(int i=0;i<students.length;i++){
   	 Student student =students[i];
   	 if(student==null) {
   		continue;
   	 }else {
   	 
   	System.out.println(student.getId()+"        "+student.getName()+"               "+student.getSex()+"              "+student.getAge()+"    "+student.get_class()+"         "+student.getPhone()+"      "+student.getAddress() );	 
   		 
  /* System.out.println("ѧ��id��"+student.getId());
   System.out.println("ѧ��������"+student.getName());
   System.out.println("ѧ���Ա�"+student.getSex());
  System.out.println("ѧ�����䣺"+student.getAge());
  System.out.println("ѧ���༶��"+student.get_class());
  System.out.println("ѧ���绰��"+student.getPhone());
  System.out.println("ѧ����ַ:"+student.getAddress());*/
   	 }
   	 }

 
}





public void sdelete() throws addException {
	// TODO Auto-generated method stub
	
			Scanner s=new Scanner(System.in);
			System.out.println("������Ҫɾ����id");
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
				System.out.println("ɾ���ɹ�");
			}
	
}



	}
	
/*int id, String name, String sex, int age, String _class, String address, int phone, String email
*/