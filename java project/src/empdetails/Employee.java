package empdetails;

import java.util.Scanner;

public abstract class Employee {
	
int p,t;
	
	public void salary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("time:");
		t=sc.nextInt();
		System.out.println("Salary :");
		p=sc.nextInt();
		
	}
	
	
	public abstract void calculateSalary();

}

