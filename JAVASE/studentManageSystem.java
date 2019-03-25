import java.util.Scanner;








public class studentManageSystem{
	public static void main(String[] args){
		welcome();
		
		Manager[] managers = new Manager[4];//�ֲ�����
		initData(managers);//���ݳ�ʼ��
		operation(managers);
		
	}
	
	
	public static void initData(Manager[] managers){
		Manager manager = new Manager("admin","admin");
		managers[0] = manager;
	}
	
	public static void operation(Manager[] managers){
		Scanner s=new Scanner(System.in); 
		
		//s.nextLine();
		System.out.println("��ѡ��");
		int operation = s.nextInt();
		if(operation == 1){
			//��½
			login(managers);
		}else if(operation == 2){
			//�˳�
			System.exit(0);
		}else{
			System.out.println("�������������������롣");
			operation(managers);//�ݹ����
		}
	}
	
	public static void login(Manager[] managers){
		System.out.println("��ӭ��½");
		
		Scanner s=new Scanner(System.in); 
		System.out.println("�������û�����");
		String username = s.nextLine();


		
		System.out.println("���������룺");
		String password = s.nextLine();
		
		
		
		//�ж������Ƿ���ȷ
		for(int i = 0;i < managers.length;i++){
			Manager manager = managers[i];
			if(manager == null){
				continue;
			}
			
			if(username.equals(manager.username) && password.equals(manager.password)){
				System.out.println("��ӭ��" + username);
				break;
			}
		}
	}
	
	public static void welcome(){
		System.out.println("==========��ӭ��½==========");
		System.out.println("1����½   2���˳�");
		System.out.println("----------------------------");
	}
}
class Manager{
	public String username;
	public String password;
	
	public Manager(String username,String password){
		this.username = username;
		this.password = password;
	}
	
	
	public String getUsername(){
		return username;
	}
	public void setUsername(String username){
		this.username = username;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password; 
	}
}
class Student{
	public int id;
	public String name;
	public String sex;
	public int age;
	public String address;
	public String _class;
	public String phone;
	public String email;
	
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
}