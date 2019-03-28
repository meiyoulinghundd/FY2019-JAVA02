package practice;

import java.util.Scanner;

public class Test {

 public static void main(String[] args) {
	 
	 Scanner sc= new Scanner(System.in);
	 String s=new String();
	 System.out.println("Please input the String:");
	 s=sc.nextLine();
	 int count = 0;
     int index = -1;
     String Tofind = "java";
     while((index = s.indexOf(Tofind)) != -1){
         s = s.substring(index+Tofind.length());
         count++;}
     System.out.println("java出现的次数："+count);
     
 }
	
	
}
