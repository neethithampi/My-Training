package ExceptionThrowsThrow;

import java.io.IOException;

public class ExceptionThrow
{
	
	public void excep(int num1,int num2) throws Exception
	{
		
		 int res=num1-num2;
		 System.out.println(res);
		 if(res<10)
		 {
			 throw new ArithmeticException();
		 }
		 else
		 {
			 throw new IOException();
		 }
	}
		
		 public void display() throws Exception
		 {
			excep(10,5); 
		 }
		
		
	

	public static void main(String[] args) {
		ExceptionThrow obj=new ExceptionThrow();
		try {
		obj.display();
		}
		catch(Exception e)
		{
			System.out.println("res<10");
		}
		
	}

}
