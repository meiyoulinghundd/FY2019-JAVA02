package practice;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 
		System.out.println("Please input the String:");
		   String s=sc.nextLine();
		System.out.println("Please input the String:");
		   String a=sc.nextLine();
		
		 System.out.println(equalsString(s, a));
	}
	 
	static boolean equalsString(String a, String b) {
        if (a.length() != b.length()) { // 长度都不想等了，其他的肯定不等
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            char a1 = a.charAt(i);
            char b1 = b.charAt(i);
            if (a1 != b1) {
                return false;
            }
        }
        return true;
    }
}
	
