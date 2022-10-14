package Day29;

public class Circle {

    final double PI = 3.14;
    double r;

    double area() {
        double areaOfCircle = PI*r*r;
        return areaOfCircle;
    }

    double perimeter() {
        double perimeterOfCircle = 2*PI*r;
        return perimeterOfCircle;
    }

}
