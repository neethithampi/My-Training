package superkey;

public class Parent {
	int num1,num2,res;
	public Parent(int n,int m)
	{
		
		num1=n;
		num2=m;
		res=num1+num2;
		
	}
	public void display()
	{
		System.out.println("The sum of 2 numbers:" +res);
	}

}
