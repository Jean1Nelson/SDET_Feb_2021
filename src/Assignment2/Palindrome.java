package Assignment2;
import java.util.*;


public class Palindrome {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter in a word: ");
    String i = sc.next();
   // System.out.println(i);
    sc.close();
	
    String p = "Turt";

	if (i == p)
		System.out.println("That's right!");
	else 
		System.out.println("Sorry entered word is not a palidrome");
	}  
}