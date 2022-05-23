package abstraction;
import java.util.*;
public class ImageSearch extends Google{

	public void search()
	{
		System.out.println("Search images");
	}
	
	public void disp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Image to be displayed:");
		String b= sc.nextLine(); 
		
	}

	public static void main(String[] args) {
		
		ImageSearch obj2=new ImageSearch();
		obj2.display();
		obj2.search();
	}

}
