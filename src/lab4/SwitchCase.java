package lab4;
import java.util.*;

public class SwitchCase {
	
	 public static void main(String[] args) {

		 char word1, word2;
	Scanner scan = new Scanner(System.in);
	 
	   System.out.println("Enter letter: ");
	   word1 = scan.next().charAt(0);
	     	 
	   scan.close();
	   
	   switch(word1) //d : char variable
	   {
	        case 'a'://+
	            System.out.println("Vowel");
	            break;
	        
	        case 'e'://-
	            System.out.println("Vowel");
	            break;
	            
	            
	        default:
	            System.out.println("You have entered a consonant" );
	   }
	   
	    }

	}
