public class InvoiceGenerator {

	public static void main(String[] args) 
	{
		int itemA = 200, itemB = 80, itemC = 150;
		
		double total_amt;
		
		double disc,tax;
		total_amt = ((3*itemA) + (5*itemB)  +(2*itemC));
		
		disc = (0.15 * total_amt);
		
		total_amt = total_amt - disc;
		
		tax = (.02 * total_amt);
		
		total_amt = total_amt + tax;
		// total_amt += tax; shorthand notation of previous line
		
		System.out.println("" + total_amt);
	}

}
