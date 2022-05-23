package divisible;

public class Divisibility extends Addition
{ 

	public void divisibility()
{
         int s=super.sum(10,20);
		System.out.println("The sum is:" +s);
		if(s%10==0)
		{
			System.out.println("the sum is divisible by 10");
		}
		else
		{
			System.out.println("the sum is not divisible by 10");
		}


	}

	public static void main(String[] args)
	{
        Divisibility obj=new Divisibility();
        obj.divisibility();
      

	}

}
