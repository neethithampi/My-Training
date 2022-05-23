package salary;

import java.util.Scanner;

public class Class1 {
	double basic_salary,deduction,bonus;
	
	public void basic()
	{	
	

	  Scanner scan=new Scanner(System.in);

	  System.out.println("Enter Basic Salary Of Employee: ");
	  basic_salary=scan.nextFloat();

	  System.out.println("Enter Deduction from Salary: "); 
	  deduction=scan.nextFloat();
	 
	  System.out.println("Enter Bonus of Salary: ");
	  bonus=scan.nextFloat();

	  
	  }
	}

	