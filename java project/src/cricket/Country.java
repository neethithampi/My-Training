package cricket;

public class Country extends Team{
	
	public void countryList()
	{
		System.out.println("Countries that play cricket:");
		System.out.println("India");
		System.out.println("Australia");
		System.out.println("Srilanka");
		System.out.println("Bangladesh");
		System.out.println("New Zealand");
		System.out.println("South Africa");
		System.out.println("Pakisthan");
		System.out.println("West Indies");
		System.out.println("Zimbavae");
	}
	public static void main(String[] args) {
		
		Country obj=new Country();
		obj.cricketTeam();
		obj.countryList();
		MatchType obj1=new MatchType();
		obj1.matches();
	}

}
