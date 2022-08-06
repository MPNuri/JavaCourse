package Day6;

import java.awt.*;

public class _02_PrimitiveReferenceType {
    public static void main(String[] args) {

        int x = 3;
        int y = x; // so here int y = 3; so after this line if x may updated value of y wont change
        // we are just copiying the value x hodls

        System.out.println(x);
        System.out.println(y); // y equals value x holds

        x = 5; // this means x is updated to 5

        System.out.println(x);//5
        System.out.println(y);//3
        /*  is not updated because we are storing the value x holds before the update
        if we were to update the x before printing that would update the y as well if y is written below x and not
         printed earlier on*/

       Point point1 = new Point(1,1);
        Point point2 = point1;


        System.out.println("before update" + point1); //x,1 y,1
        System.out.println("after update" + point2); //x,1 y,1

       point1.x = 0;
       // both points will be updated because first point1 s x will be updated and right after that point2 s x is going to be updated


        System.out.println(point1);  //x,0 y,1
        System.out.println(point2);  //x,0 y,1












    }
}
