/*
Cole Ballagh
pd.2
4-6-20
 */
public class Parallelogam extends Rectangle{
    private double angle;

    // Dedine the Constructor
    Parallelogam(double side1, double side2, double angle) {
        super(side1, side2);
        if (angle < 0) angle = 0;
        else if (angle > 1) angle = 1;
        this.angle = angle;
    }

    // Cannot use the rectangle version, so defines its own getArea()
    double getArea() {
        return angle * this.height * this.width;

    }
}
