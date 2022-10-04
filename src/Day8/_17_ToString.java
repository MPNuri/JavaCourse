package Day8;

import java.awt.*;

public class _17_ToString {
    public static void main(String[] args) {


        //primitive types does not have shortcut methods like reference types
        // we cannot do numbers.

        Point point = new Point(1, 1);

        System.out.println(point); // now this is a point

        String pointString = point.toString();
        System.out.println(pointString);
        // this method helps us to use these methods onto primitives
        //we are now able to use string methodss (String ... = point.tostring) after this e can use any method





    }
}