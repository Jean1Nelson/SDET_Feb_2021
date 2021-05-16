package Exceptions;
import java.util.*;

public class ThrowsEx {

        //Throws exception if any number is divided by 0
        public static int divide(int num1, int num2) throws ArithmeticException 
        //declaring the exception category that can be thrown by this code
        { //program signature
            int result = num1/num2;
            return result;
        }
       public static void main(String args[]){
           
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number 1 : ");
            int num1 = scanner.nextInt();
            System.out.println("Enter number 2 : ");
            int num2 = scanner.nextInt();
            int result = 0;
            scanner.close();
            try{
            result=divide(num1,num2);
            }
            catch(Exception e){e.printStackTrace();}
            System.out.println("Result is : "+result);
       }
    }
