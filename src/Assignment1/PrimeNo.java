package Assignment1;

public class PrimeNo {

	public static void main(String[] args) 
		{
			int i, number, count; 
				
			for(number = 1; number <= 10; number++)
			{
				count = 0;
			    for (i = 2; i <= number/2; i++)
			    {
			    	if(number % i == 0)
			    	{
			    		count++;
			    		break;
			    	}
			    }
			    if(count == 0 && number != 1 )
			    {
			    	System.out.println( "Prime Numbers from 1 to 10 are :" + number + " ");
			    }  
			}

			
		}
}
