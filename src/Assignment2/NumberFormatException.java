package Assignment2;

public class NumberFormatException {

    public static void main(String args[]) {
        try {
            int num = Integer.parseInt("hjk");
            
            System.out.println(num);
       } finally {
    	   
       }
//        catch (NumberFormatException e) {
//            e.printStackTrace();
          System.out.println("Number format exception occurred");
//        }
//    }
}
}


