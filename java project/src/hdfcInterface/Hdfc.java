package hdfcInterface;
import java.util.*;

public class Hdfc implements RBI {
	
	double a,d,res;
	
  public void recurringDeposit()
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("The amount is:");
	  a=sc.nextDouble();
	  System.out.println("The duration is:");
	  d=sc.nextDouble();
	  
	  
  }
  
  public void deposit()
  {
	   res=(a*INTEREST*d)/100;
  }
  
  public void print()
  {
	  System.out.println("The amount is:" +a);
	  System.out.println("The duration is:" +d);
	  System.out.println("The resultant amount is:" +res);
	  
  }

	public static void main(String[] args) {
		
		Hdfc obj=new Hdfc();
		obj.recurringDeposit();
		obj.deposit();
		obj.print();
		
	}

}
