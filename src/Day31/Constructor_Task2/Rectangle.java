package Day31.Constructor_Task2;

public class Rectangle {

    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }



    public int calculator() {
       return length*width;
    }
}
