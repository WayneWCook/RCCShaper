/*
Ryan Mills
P: 1
4-14-20
 */


public class Hexagon extends Shape {

    //atributes
    private double side;
//constructor
     Hexagon(double side) {
        this.side=side;

    }
    //methods
    double getArea() {return 3 * (Math.sqrt(3) / 2) * (side * side);}
    double getPerimeter() {return 6 * side;}
}
