/*
Ryan Mills
P: 1
4-14-20
 */


public class Octogon extends Shape {

    //atributes
    private double side;
    //constructor
    Octogon(double side) {
        this.side=side;

    }
    //methods
    double getArea() {return 2 * (1 + Math.sqrt(2)) * (side * side);}
    double getPerimeter() {return 8 * side;}
}
