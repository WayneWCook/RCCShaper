/*
Triangle.java
22 April 2020
Colin Grebenstein
Adds the ability to find the area or perimeter
 */
public class Triangle extends Shape {

    private double base, hypotenuse, side, height;

    Triangle(double base, double hypotenuse, double side, double height) {
        this.base = base;
        this.hypotenuse = hypotenuse;
        this.side = side;
        this.height = height;
    }

    @Override
    double getArea() {
        return base * height;
    }

    @Override
    double getPerimeter() {
        return base + hypotenuse + side;
    }
}
