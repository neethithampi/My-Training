package stud;

public class Address {

    private String houseName;
    private int houseNum;
    private String place;
    private int pin;
    private StudDetails s;
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public int getHouseNum() {
		return houseNum;
	}
	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public StudDetails getS() {
		return s;
	}
	public void setS(StudDetails s) {
		this.s = s;
	}
    
	void display()
	{
		System.out.println("NAME:" +getS().getStudname());
		System.out.println("ROLLNO:" +getS().getRollno());
		System.out.println("HOUSE NAME:" +getHouseName());
		System.out.println("HOUSE NO:" +getHouseNum());
		System.out.println("PLACE:" +getPlace());
		System.out.println("PIN:" +getPin());
		
	}
	


	
}
