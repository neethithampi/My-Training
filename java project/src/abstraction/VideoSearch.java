package abstraction;

public class VideoSearch extends Google {
	
	public void search()
	{
		System.out.println("Video Search");
	}

	public static void main(String[] args) {
		VideoSearch obj3=new VideoSearch();
		obj3.display();
		obj3.search();
		

	}

}
