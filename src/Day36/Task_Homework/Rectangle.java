package Day36.Task_Homework;

public class Rectangle extends Shape{

    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        super.area = a*b;
        super.perimeter = 2*(a+b);
    }







}
