package Day36.Task_Homework;

public class Demo {
    public static void main(String[] args) {


        Circle circley = new Circle(5);
        System.out.println(circley.r);
        System.out.println(circley.circleArea());
        System.out.println(circley.perimeterCircle());


        Rectangle rectangle = new Rectangle(37,8);
        System.out.println(rectangle.area);
        System.out.println(rectangle.perimeter);

        Square square = new Square(6);
        System.out.println(square.area);
        System.out.println(square.perimeter);







    }
}
