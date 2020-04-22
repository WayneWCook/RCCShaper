
/* Hexagon

 * Caden

 * 25 March 2020


 */

//package Shape-RCC;



public class Hexagon extends Shape {



    protected double width;



    Hexagon(double myWidth ) {

        width = myWidth;



    }

    double getArea() {

        return (6*(width*width))/(4*Math.tan(Math.PI/6));

    }

    double getPerimeter() {

        return (width * 6);

    }

}