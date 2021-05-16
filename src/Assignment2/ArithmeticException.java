package Assignment2;

public class ArithmeticException {

	public static void main(String[] args) {
		 int array[] = {8,2,4};
         int num1 = 8, num2 = 0;
         int total = 0;
        
         try 
         {
             total = num1/num2;
             System.out.println("The result is" + total);
             
             for(int i = 8; i >= 0; i--) 
                {
                   System.out.println("The value  is: " + array[i]);
                }
         } 
         catch(Exception e)
         {
             e.printStackTrace();
         }
         
         System.out.println("not the Total, but The End!");
      }       

	}



