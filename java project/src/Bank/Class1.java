package Bank;
import java.util.*;

public class Class1 {
	private int pin;

	public int getPin()
	{
		return pin;
	}

	public void setPin(int pin)
	{
		this.pin = pin;
		if((pin==1001)||(pin==1234)||(pin==1212))
		{
			System.out.println("Entered pin is valid");
		}
		
		else
			System.out.println("Entered pin invalid");
		
			
		}
	}
	


