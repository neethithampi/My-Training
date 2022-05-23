package vehicle;
import java.util.*;

public class Model {
	
	String t;
	public void vehicleModel()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("the vehicle type is:" );
		 t=sc.nextLine();
		switch(t)
		{
		case ("fourwheeler"):
		{
			System.out.println("The vehicle is a car");
		}
		
		break;
		case ("twowheeler"):
		{
			System.out.println("The vehicle is a bike");
		}
		break;
		default:
			System.out.println("None");
		}
		
	}

}
