package lab6;

public class Average {

	 public static void main(String[] args) {
	        double[] numArray = { 4,3,3 };
	        double sum = 0.0;

	        for (double num: numArray) {
	           sum += num;
	        }

	        double average = sum / numArray.length;
	        System.out.println("The average is:"+ average);
	    }
	}

