package collectionExample;
import java.util.ArrayList;
import java.util.Collections;


public class ArrayListExample {

	public static void main(String[] args) {

       ArrayList <String> ls=new ArrayList<String>();
       ls.add("neethi");
       ls.add("devansh");
       ls.add("nimmi");
       ls.add("pooja");
       ls.add("abhi");
       ls.add("deepu");
       
       System.out.println(ls);
       Collections.sort(ls);
       System.out.println("After sortin:");
       System.out.println(ls);
       ls.remove(2);
       System.out.println("After removing:");
       System.out.println(ls);
     /*  for(int i=0;i<ls.size();i++)
       {
    	   System.out.println(ls.get(i));
       }*/
       		
       for(String e:ls)
       {
    	   System.out.println(e);
       }

	}

}
