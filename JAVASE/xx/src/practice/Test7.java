package practice;

public class Test7 {

	
	public static void main(String[] args) {
		String s = "113@ ere qqq yyui";
		s = s.replaceAll("@", "");
		String [] ss=s.split(" ");
		
		for (int i = 0; i < ss.length; i++) {
		System.out.println(ss[i]);
		}

	}
	
	
}
