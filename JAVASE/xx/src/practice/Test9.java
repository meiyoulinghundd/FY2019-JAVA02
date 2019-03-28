package practice;

public class Test9 {
	public static void main(String[] args) {
		String s="name=zhangsan age=18 classNo=090728";
		String[] ss = s.split(" ");
		StringBuffer sa =new StringBuffer();
		for (int i = 0; i < ss.length; i++) {
		String[] ss2 =ss[i].split("=");
		sa.append(ss2[1]);
		sa.append(" ");
		}
		System.out.println(sa);
		}
}
