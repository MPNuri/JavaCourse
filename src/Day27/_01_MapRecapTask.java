package Day27;

import java.util.HashMap;

public class _01_MapRecapTask {
    public static void main(String[] args) {


        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);
        hashMap.put("Five", 5);

        System.out.println(hashMap);

        // Map is given above:
        // check, does this map contain key "Six"
        // if it does not contain key "Six", put as "Six" =6

        // part 2: check does this map contain key "Three"
        // if it contains key "Three", change the value of it to 33


        boolean checkFirst = hashMap.containsKey("Six");
        System.out.println(checkFirst);

        hashMap.put("Six", 6);
        System.out.println("\"Six\""   + " = "+ hashMap.get("Six"));

        if (hashMap.containsKey("Three")) {
           hashMap.put("Three", 33);
       }
        System.out.println(hashMap);





    }
}
