package studentdetails;


public class Student extends School {
	
	//int a,b,c;
	
	public void studentDetails()
	{
	
		System.out.println("Class: X11");
		System.out.println("Student name: Neethi");
		System.out.println("Roll no:" +20);
	}

	public static void main(String[] args) {
		Student obj=new Student();
		obj.schooldetails();
		obj.studentDetails();
		
		

	}

}
