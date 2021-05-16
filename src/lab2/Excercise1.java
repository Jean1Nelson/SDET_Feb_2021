package lab2;

public class Excercise1 {

    int inst1 = 34;
    static int inst2 = 12;
    //you cannot access instacne variables or non-staatic variables directly from a static method. 
    //Cannot make a static reference to a non-static variable
    public static void main(String[] args) 
    {
     System.out.println("The value of static variable is:" + Excercise1.inst2);
     Excercise1 v1 = new Excercise1();
     double val = 6.2;
     double val2 = 3.1;
    
     System.out.println("The value of instance variable is:" + v1.inst1);
     System.out.println("The value of product is:" + v1.calcValue(val,val2));
     
     System.out.println("The value of first local variable is:" + val);
     System.out.println("The value of second local variable is:" + val2);
    }
    
    public double calcValue(double a, double b)
    {
        System.out.println("The value of instance variable is:" + inst1);
        System.out.println("The value of static variable is:" + inst2);
        
        double prod = a*b;
        return prod;
    }
}
