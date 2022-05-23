package collectArray;
import java.util.ArrayList;

public class ColoursArray {
	     String element;
	    public void colours()
	    {
		ArrayList <String> al=new ArrayList <String>();
		al.add("red");
		al.add("blue");
		al.add("green");
		al.add("orange");
		al.add("black");
		System.out.println(al);
		element=al.get(3);
		System.out.println("retrieved element is:"+element);
		System.out.println("Iterative result is:");
		for(String element:al)
		{
			 System.out.print(element);
			 System.out.print(",");
		}
		System.out.println();
		al.remove(2);
		System.out.println("resultant array after removing:");
		System.out.println(al); 
		if(al.contains("blue"))
		{
			System.out.println("Found the element");
		}
		else
		{
			 System.out.println("There is no such element");
		}
		
	    }
		
		
		
		public static void main(String[] args)
		{
			ColoursArray obj=new ColoursArray();
			obj.colours();
		
		
	}

}
