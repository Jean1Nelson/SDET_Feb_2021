package Lab12;
import java.util.*;

public class Join {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("hat");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("coat");
		list2.add("gloves");
		         
		
		list1.addAll(list2);    
		         
		System.out.println(list1);
		    }
	}

