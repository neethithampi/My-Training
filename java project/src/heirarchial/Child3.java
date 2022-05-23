package heirarchial;

public class Child3 extends Father {
	public void childname3()
	{
		System.out.println("Child3 nme is: zxy");
	}

	public static void main(String[] args) {
		Child3 obj=new Child3();
		obj.childname3();
		obj.name();

	}

}


