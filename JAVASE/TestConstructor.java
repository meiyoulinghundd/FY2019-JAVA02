


//���췽��
public class  TestConstructor{
	
	public static void main(String[]args){
		
	 Product p=new Product(); //gouzaofangfa
	   p.setPrice(3.0);
        System.out.println(p.price);	
	}
	
	
	
}


class Product{
	
	public String name;
	public double price;
	public String images;
	public String rule;
	public String desc;
	public  int  categoryId;
	
	
	//���幹�췽�� ����ͬ�� û�з���ֵ
	
	
	public  Product(){
		System.out.println("diaoyong");
	}
	
	
	//��ȡ��Ʒ�۸�
	
	public double  getPrice(){
		
		return price;
	}
	
	//��ȡ��Ʒ�۸�
	public void setPrice(double p ){
		
		  price=p;
	}
	
	
}