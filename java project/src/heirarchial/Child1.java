package heirarchial;

public class Child1 extends Father{
	
	public void childname1()
	{
		System.out.println("Child1 nme is: abc");
	}

	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.childname1();
		obj.name();

	}

}
