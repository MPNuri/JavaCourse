package Day36.Task_Homework;

public class Circle extends Shape{

    final double PI = 3.14;
    double r;

    // instead of these 2 methods lets see better solution

    public double circleArea() {
        return (2*r*PI);
    }

    public double perimeterCircle() {
        return (PI*Math.pow(r,2));
    }


    public Circle(double r) {
        this.r = r;
        super.area = PI*Math.pow(r,2);
        super.perimeter = 2*PI*r;
    }





}
