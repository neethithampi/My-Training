package discount;

public class OffSeason extends OnSeason {
	
	public void discount()
	{
		
		dis=(15*mrp)/100;
		amnt=mrp-dis;
		System.out.println("amount after discount at offseason ="+amnt);
	}
	

	public static void main(String[] args) {
		
		OffSeason obj=new OffSeason();
		obj.marketprice();
		obj.discount();
		OnSeason obj1=new OnSeason();
		obj1.marketprice();
		obj1.discount();

	}

}
