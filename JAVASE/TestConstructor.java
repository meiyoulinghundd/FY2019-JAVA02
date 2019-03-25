


//构造方法
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
	
	
	//定义构造方法 鱼类同名 没有返回值
	
	
	public  Product(){
		System.out.println("diaoyong");
	}
	
	
	//获取商品价格
	
	public double  getPrice(){
		
		return price;
	}
	
	//获取商品价格
	public void setPrice(double p ){
		
		  price=p;
	}
	
	
}