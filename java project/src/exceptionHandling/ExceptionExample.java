package exceptionHandling;

public class ExceptionExample {
	
	int arr[]=new int[5];
	public void excep(int num1,int num2)
	{
		try
		{
		 int res=num1/num2;
		 System.out.println(res);
		 for(int i=0;i<=5;i++)
		 {
			 arr[i]=i+1;
			 System.out.println(arr[i]);
		 }
		}
		
	catch(ArithmeticException e)
		{
			System.out.println("division by zero not possible");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("elements till 5 is possible");
		}
		
		catch(Exception e )
		{
			System.out.println("Exception error");
		}
		
		finally
		{
			System.out.println("Final Block");
		}
		
		System.out.println("End");
	}
	

	public static void main(String[] args) {
		
		ExceptionExample obj=new ExceptionExample();
		obj.excep(10,0);
		
		
		
		 

	}

}
