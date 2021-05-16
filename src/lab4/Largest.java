package lab4;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {

        int x;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        
        x = scan.nextInt();
        
        scan.close();
        
        if(x>=0 && x<10)
        {
            System.out.println("1-digit");
        }
        else if(x<100 && x>=10)
        {
            System.out.println("2-digit");
	}
        else
        {
            System.out.println("number is not in 1 & 99999");
        }
    }

}