package salary;

public class Class3 extends Class2{
	double total;
	public void totalSalary()
	{
		total=basic_salary+hra-pf-deduction+bonus;
	}
 public void salaryslip()
 {
	 System.out.println("Salary Slip:");
	 System.out.println("Basic Salary:"+basic_salary);
	 System.out.println("Deduction:"+deduction);
	 System.out.println("HRA:"+hra);
	 System.out.println("PF:" +pf);
	 System.out.println("Bonus:" +bonus);
	 System.out.println("Total Salary:" +total);
 }
	public static void main(String[] args) {
		Class3 obj=new Class3();
		obj.basic();
		obj.hra();
		obj.pf();
		obj.totalSalary();
		obj.salaryslip();

	}

}
