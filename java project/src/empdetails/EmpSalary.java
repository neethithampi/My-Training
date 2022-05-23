package empdetails;

import java.util.Scanner;

public class EmpSalary extends Employee {
	
	final int CONST=8;

	
	
	public  void calculateSalary()
	{
		
		super.p=super.p*CONST;
		System.out.println("The salary :" +super.p);
		
	}

	public static void main(String[] args) {
  
		EmpSalary obj1= new EmpSalary();
		obj1.salary();
		obj1.calculateSalary();
       

	}

}
