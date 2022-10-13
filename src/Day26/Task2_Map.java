package Day26;

import java.util.*;

public class Task2_Map {
    public static void main(String[] args) {



        Map<Integer, String> cities = new HashMap<>();

        cities.put(75010, "Plano");
        cities.put(75075, "Allen");

        Set<Integer> keys = cities.keySet();

        for (Integer key : keys) {
            System.out.println(key + " => " + cities.get(key));
        }















    }
}
