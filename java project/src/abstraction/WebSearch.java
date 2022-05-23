package abstraction;
import java.util.*;

public class WebSearch extends Google{
	
	public void search()
	{
		System.out.println("Search web ");
	}
	
	public void print()
	{
		Scanner sc=new Scanner(System.in);
	     System.out.println("Animal:");
	     String a=sc.nextLine();
	}
	

	public static void main(String[] args) {
		WebSearch obj=new WebSearch();
		obj.display();
		obj.search();
		obj.print();
	}

}
