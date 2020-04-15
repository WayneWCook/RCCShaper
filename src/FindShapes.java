/* FindShapes.java
 * Wayne Cook
 * 25 March 2020
 * Create the main class to test the rectangle, square, circle and rhombus classes.
 * Force a commit
 */
//package Shape-RCC;

public class FindShapes {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(15,10);
        Square square = new Square(7);
        Circle circle = new Circle(3);
        Rhombus rhombus = new Rhombus(5, 0.5);
        Parallelogam parallelogam = new Parallelogam(3,5,.45);
        Hexagon hexagon = new Hexagon(7);
        System.out.println("Rectangle are is: " + rec1.getArea());
        System.out.println("Hexagon area is: " + hexagon.getArea());
        System.out.println("Parallelogram area is: " + parallelogam.getArea());
        System.out.println("Square area is: "+ square.getArea());
        System.out.println("The sum can go in either direction!");
        System.out.println("The sum of the rectangle and square areas is: " + rec1.addArea(square));
        System.out.println("The sum of the square and rectangle areas is: " + square.addArea(rec1));
        System.out.println("The Circle area is: " + circle.getArea());
        System.out.println("The Rhombus area is: " + rhombus.getArea());
        System.out.println("The circle and rectangle areas add to: " + circle.addArea(rec1));
        System.out.println("The Rhombus and Square areas add to: " + rhombus.addArea(square));
        System.out.println("The Rhombus and Circle areas add to: " + rhombus.addArea(circle));
        System.out.println("The Parallelogram and Circle areas add to: " + parallelogam.addArea(circle));
    }

}

