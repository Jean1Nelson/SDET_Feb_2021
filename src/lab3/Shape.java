package lab3;

public class Shape {
    
    //Rectangle
    public void calculatePerimeter(int base, int height) {
        System.out.println("Rectangle's Perimeter is: "+ (2*(base+height)));
    }
    
    //Square
    public void calculatePerimeter(int side) {
        System.out.println("Square's Perimeter is: "+ (4*side));
    }
    
    //Triangle
    public void calculatePerimeter(int a, int b, int c) {
        System.out.println("Triangle's Perimeter is: "+ (a+b+c));
    }
}
