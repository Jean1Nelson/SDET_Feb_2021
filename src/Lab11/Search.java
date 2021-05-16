package Lab11;
import java.util.*;

public class Search {

	  //3. Search an element of Java ArrayList
	    public static void main(String args[]) {
	        
	        List<String> myList = new ArrayList<String>(List.of("One","Two","Three","Four","Five"));
	        
	        //Search criteria
	        String searchCriteria = "Two";
	        
	        if(myList.contains(searchCriteria))
	            System.out.println("Element " +searchCriteria+ " Found - Index: "+ myList.indexOf(searchCriteria));
	        else
	            System.out.println("Element NOT found");
	        
	    }
}