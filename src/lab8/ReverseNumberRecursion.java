package lab8;
import java.util.Scanner;

public class ReverseNumberRecursion {

	   //A method for reverse
	   public static void reverseMethod(int num) 
	   {
	       if (num < 10) 
	       {
	    	   System.out.println(num);
	    	   return;
	       }
	       else 
	       {
	           System.out.print(num % 10);
	           //Method is calling itself: recursion
	           reverseMethod(num/10);
	       }
	   }
	   public static void main(String args[])
	   {
		int num=0;
		System.out.println("Input your number: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		in.close();
		System.out.print("Reverse of the input number is:");
		reverseMethod(num);
		System.out.println();
	   }
	} 