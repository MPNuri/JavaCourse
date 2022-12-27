package Java_Interview_3;

import java.util.ArrayList;
import java.util.List;

public class x {

    public static void main(String[] args) {

        List<String> c = new ArrayList<>();
        c.add("a");
        c.add("b");
        c.add("a");
        c.add("d");

        if (c.remove("a")) {
            c.remove("f");
        }
        System.out.println(c);
    }
}
