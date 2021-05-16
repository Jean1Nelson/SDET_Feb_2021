package lab3;

import lab3.Shape;

public class Exercise2 {
    
    /* 2. Write a program where your class will overload calculatePerimeter() for different shapes, each with different 
       set of parameters, and print the values from each implementation. */
    
        public static void main(String[] args) {
            Shape per = new Shape();
            
            per.calculatePerimeter(2, 4);
            per.calculatePerimeter(7, 7, 7);
            per.calculatePerimeter(5);

            
        }
    
}
