package practice;

public class Test91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "name=zhangsan age=18 classNo=090728";
		String[] a = string.split(" ");
		
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);
			String string1 = a[i];
			String[][] b = new String[a.length][];
			b[i] = a[i].split("=");
			
				System.out.println(b[i][0]);
		
	}

	}
	}
