package inheritance;

public class Child extends Parent {
	
	public void display()
	{
		System.out.println("The result is:" +res);
	}


	public static void main(String[] args)
	{
		Child obj=new Child();
		obj.show(5,6);
		obj.display();
		
		
	}


	

}
