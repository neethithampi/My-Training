package empdetails;
import java.util.*;

public class Contractor extends Employee{
	
	
	
	public void calculateSalary()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("time:");
		int time=s.nextInt();
		p=p*10;
		System.out.println("The salary :" +p);
		
	}
	

	public static void main(String[] args) {
		
		Contractor obj=new Contractor();
		obj.salary();
		obj.calculateSalary();

	}

}
