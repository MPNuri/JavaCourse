package Day27;

import java.util.*;

public class _03_TypesOfMap {
    public static void main(String[] args) {

        // HashMap --- Unordered Map, does not allow duplication
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("String1", 100);
        hashMap.put("String12", 200);
        hashMap.put("String123", 300);
        hashMap.put("String1234", 100);

        System.out.println(hashMap);

        // TreeMap --- Using (KEY S) natural order
        // for example according to alphabet in other word ascending order

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("google", 100);
        treeMap.put("apple", 200);
        treeMap.put("samsung", 300);
        treeMap.put("manu", 100);

        System.out.println(treeMap);

        // linkedHashMap --- Insertion Order
        // Like first come first serve

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Z", 462);
        linkedHashMap.put("P", 466);
        linkedHashMap.put("K", 1686);
        linkedHashMap.put("r", 9433);

        System.out.println(linkedHashMap);



    }
}
