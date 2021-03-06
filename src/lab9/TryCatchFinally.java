package lab9;

public class TryCatchFinally {
	
	public static void main (String[] args)  
    {    
      
        int[] myArr = new int[10]; 
        try
        { 
            int i = myArr[10]; // exception occurs array assigned to int variable.
            
            //this statement never executes                  
            System.out.println("Program is inside the try block"); 
        } 
        catch(ArrayIndexOutOfBoundsException ex) 
        { 
            System.out.println("Exception has been caught in the catch block"); 
        } 
       finally
        { 
            System.out.println("Now the finally block is executed"); 
        } 
          
        // rest of the program will be executed 
        System.out.println("Program is outside the try-catch-finally "); 
    } 
} 