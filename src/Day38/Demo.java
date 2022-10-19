package Day38;

public class Demo {
    public static void main(String[] args) {

        // Reference types can Store its own and sub-types

        // new Square(); means create a new object according to Square object
        // square1 or square 2 are variable

        // one square type can be a rectangle, shape or an object


        Square square1 = new Square();
        Rectangle square2 = new Square();
        Shape square3 = new Square();
        Object square4 = new Square();


        square1.getPerimeter();
        square1.getShape();
        square1.printA();
        square1.printShapeName();

        square2.getShape();
        square2.printA();
        square2.printShapeName();

        square3.getShape();
        square3.printShapeName();

        //square4.("nothing special")










    }
}
