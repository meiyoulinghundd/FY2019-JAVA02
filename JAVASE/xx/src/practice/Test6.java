package practice;

import java.util.Scanner;

public class Test6 {
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("shuru:");
	  String s=sc.nextLine();
	  StringBuffer sa=new StringBuffer(s);
	     sa.reverse();
	  String  a=sa.toString();
	  if(s.equals(a)){
		  System.out.println("�ַ����Գ�");
		  }else{
		  System.out.println("�ַ������Գ�");
		  }
		
	    
	     
	  
	  
	  
	  
  }
}
