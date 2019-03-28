package practice;

public class Test5 {
public static void main(String[] args) {
	
	
	String s= "test";
	StringBuffer sb = new StringBuffer(s);
	sb.reverse();
	s = sb.toString();
	System.out.println(s);
}
}
