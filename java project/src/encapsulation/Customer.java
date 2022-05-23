package encapsulation;

public class Customer {
      Bank b;
      
	public static void main(String[] args) {

       Bank obj=new Bank();
       obj.setMoney(5000);
       obj.display();
       double cash=obj.getMoney();
       System.out.println("amount:"+cash);
       

	}

}
