package Day26;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class _02_Map {
    public static void main(String[] args) {

        /**
         * In map data we store data in Key-Value format.
         * Maps work like a dictionary which works like word and the meaning it holds
         * Key cannot be duplicated, however values can be duplicated
         */

        // Map contains employee name and their salaries

        HashMap<String, Integer> salaries = new HashMap<>();

        salaries.put("murillo ", 99_000);
        salaries.put("Fatih Terim ", 1_000_000);
        salaries.put("berber Reis ", 65_000);
        salaries.put("Joe Biden ", 5_000);
        // when we type same key we will only have one key with updated value

        System.out.println("Salaries Map" + salaries);


        // putIfAbsent() --- will add a new entry if key does not exist
        // if the key exist, it will not update the value

        salaries.putIfAbsent("MPN ", 89_000);
        System.out.println("Salaries Map " + salaries);

        // lets change Fatih terim s salary using puIfAbsent()
        salaries.putIfAbsent("Fatih Terim ", 2_000_000);
        System.out.println("Salaries Map" + salaries);


        //////////////////////////////////////////////////////////////////


        // get() --- can access values by their keys (just like indexes)
        System.out.println("Fatih terim salary: " + salaries.get("Fatih Terim "));

        // keySet() --- method prints all the keys from map
        // this will return a set which stores all the key from your method
        // this will help us find all the values keys hold
        Set<String> keys = salaries.keySet();
        System.out.println(keys); // in unordered method



        // values() --- value printer
        Collection<Integer> value = salaries.values();
        System.out.println("printing all the values of map:" + value);


        System.out.println(value);


        for (int xo : value)
            System.out.println(xo + salaries.get(xo));


        // printing values one by one

        for (Integer element : value)
            System.out.println(element);


        /// size() --- size of the map
        int sizeOfMap = salaries.size();
        System.out.println(sizeOfMap);

        // isEmpty() -- checks if empty
        boolean isEmpty = salaries.isEmpty();
        System.out.println(isEmpty);

        // containKey() --- return boolean - checks if map contains key
        boolean isMapContainsKey = salaries.containsKey("Fatih Terim ");
        System.out.println(isMapContainsKey); // true

        // containsValue() --- checks if map contains a value
        boolean isMapContains500000 = salaries.containsValue(500_000);
        System.out.println(isMapContains500000); // false

        // clear() --- removes all the elements
        salaries.clear();
        System.out.println(salaries); // only {} will remain









    }
}
