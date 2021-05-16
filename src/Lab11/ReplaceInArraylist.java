package Lab11;
import java.util.ArrayList;

public class ReplaceInArraylist {

	public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>();
         
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
         
        System.out.println(list);
 
         
        //Replace C with CaT
 
        list.set( list.indexOf("C") , "CaT");
 
        System.out.println(list);
    }
}
