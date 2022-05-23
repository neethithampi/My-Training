package stud;

public class StudentDetails {

	public static void main(String[] args) {
		StudDetails obj=new StudDetails();
		obj.setStudname("Neethi");
		obj.setRollno(111);
		Address obj2=new Address();
		obj2.setHouseName("Sreevalsam");
		obj2.setHouseNum(22);
		obj2.setPlace("Trivandrum");
		obj2.setPin(695501);
		obj2.setS(obj);
		obj2.display();
		
		

	}

}
