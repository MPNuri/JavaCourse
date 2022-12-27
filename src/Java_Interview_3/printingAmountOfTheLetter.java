package Java_Interview_3;

import java.util.HashMap;
import java.util.Map;

public class printingAmountOfTheLetter {
    public static void main(String[] args) {

        HashMap<Character, Integer> charCounter = new HashMap<Character, Integer>();
        String input = "sdk;;d;klddds";
        char[] splitter = input.toCharArray();

        for (char x : splitter) {
            if (charCounter.containsKey(x)){
                charCounter.put(x , charCounter.get(x) + 1);
            }
            else {
                charCounter.put(x,1);
            }
        }

        for (Map.Entry entry : charCounter.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }





    }
}
