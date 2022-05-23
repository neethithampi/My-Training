package discount;
import java.util.*;

public class OnSeason {
	int mrp,dis,amnt;
	
	public void marketprice()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("the market price is:");
		mrp=s.nextInt();
		
		
	}
	
	public void discount()
	{
		dis=(40*mrp)/100;
		amnt=mrp-dis;
		System.out.println("amount after discount at Onseason ="+amnt);
	}

}
