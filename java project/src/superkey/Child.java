package superkey;

public class Child extends Parent{

	int num1,num2,res;
	
	public Child(int num1,int num2)
	{   
		super(15,6);
		super.num1=num1;
		super.num2=num2;
		res=num1-num2;
		}
	public void display()
	{
		
		super.display();
		System.out.println("The difference of 2 numbers:" +res);
	}

	public static void main(String[] args) 
	{
		Child obj=new Child(20,8);
		obj.display();
	}

}
