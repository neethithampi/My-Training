package polymorphism;

public class Child extends Parent {
	
	public float result(int n1,float m1)
	{
		float res;
		res=n1-m1;
		return res;
	}
public void print()
{
	System.out.println("The sum is:" +super.result(11,13.6f));
	System.out.println("Child method");
}
public void diff()
{
  float f=result(11,13.5f);
  System.out.println("the difference is" +f);
  
}
	public static void main(String[] args) {
		//Child obj=new Child();
		//obj.display();
		//obj.print();
		//obj.diff();
		Parent obj1=new Child();
		float r=obj1.result(22,12.6f);
		System.out.println(r);
		obj1.display();



	}

}
