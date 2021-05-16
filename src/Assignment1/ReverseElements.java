package Assignment1;
import java.util.*;

public class ReverseElements {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int n = 0;
	
	System.out.println("Enter size of array: ");
	n = sc.nextInt();
	
	int[] arr = new int[n];
	
	for (int i=0; i<n; i++) {
	System.out.println("Please enter the elements:");
	arr [i] = sc.nextInt();
	
	System.out.println("Elements entered by you: ");
	for (int j=0; j<arr.length; j++) {
		System.out.println(arr[j]);
	}
	System.out.println("Your elements revered are: ");
	for (int k=arr.length-1; k>=0; k--) {
		System.out.println(arr[k]);
		
	sc.close();
	}
}
	}
}
