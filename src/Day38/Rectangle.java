package Day38;

public abstract class Rectangle extends Shape {

    @Override
    String getShape() {
        return "Rectangle";
    }

    @Override
    void printShapeName() {
        System.out.println("Rectangle");
    }


   void printA() {
       System.out.println(20);
   }

}