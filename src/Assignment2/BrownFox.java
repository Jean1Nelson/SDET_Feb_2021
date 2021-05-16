package Assignment2;

public class BrownFox {
	public static void main(String[] args) {
	String str = "A brown fox ran away fast";
	
    int intIndex = str.indexOf("brown");
   
    if(intIndex == 0) 
    {
       
    System.out.println("brown not found");
    } 
    
    else
    {
    System.out.println("Found brown at index " + intIndex);
    }

	}	
}
