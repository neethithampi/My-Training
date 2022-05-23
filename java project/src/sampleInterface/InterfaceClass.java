package sampleInterface;

public class InterfaceClass implements SampleInterface3 {
	

	public int print(int num)
	{
		num+=MAX;
		return num;
	
	}
	
	public void sayHello()
	{
		System.out.println("Hello");
	}
	
	public void welcome()
	{
		System.out.println("Welcome");
	
	}
	public  void print2()
	{
		System.out.println("World");
	}


	public static void main(String[] args) {
		InterfaceClass obj=new InterfaceClass();
		obj.sayHello();
		obj.welcome();
		obj.print2();
		int num=obj.print(10);
		System.out.println("number:" +num);

	}


}
