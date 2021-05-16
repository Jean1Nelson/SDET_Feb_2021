package Assignment2;

public class PassAnArgument {

	public static void main(String[] args) {
	     
		try {
	         
		int c = 5/0; 
		
		System.out.println("throwing an exception");
	      
		} catch (Exception e) {
	         
	    	  System.out.println(e);
	      }
	   }
	}

