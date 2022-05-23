package heirarchial;

public class Child2 extends Father{
	public void childname2()
	{
		System.out.println("Child2 nme is: def");
	}

	public static void main(String[] args) {
		Child2 obj=new Child2();
		obj.childname2();
		obj.name();

	}

}


