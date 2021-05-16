package Lab11;
import java.util.ArrayList;

public class InsertAndRetrieve {

	public static class ArrayListDemo {
		public static void main (String[] args)  {

		      // empty array list with capacity
		      ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
		      arrlist.add(8);
		      arrlist.add(6);
		      arrlist.add(3);
		      arrlist.add(4);

		      System.out.println(arrlist);
		      // adding element 25 at third position
		      arrlist.add(2,25);
		        
		     
		      for (Integer number : arrlist) {
		         System.out.println("Number = " + number);
		      }  
		   }
		}   
}
