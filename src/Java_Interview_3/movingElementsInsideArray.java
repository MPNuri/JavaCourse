package Java_Interview_3;

import Day22.Arraylist_Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class movingElementsInsideArray {
    public static void main(String[] args) {
        // move all the zero in the middle of negative and positive numbers

        int[] inputs = {0,-5,10,5,9,76,61,-56,0,64,-7,0,896};

        ArrayList<Integer> arraylistInputs_0 = new ArrayList<>();
        ArrayList<Integer> arraylistInputsPositive = new ArrayList<>();
        ArrayList<Integer> arraylistInputsNegative = new ArrayList<>();


        for (Integer sortedNumbers : inputs)
            if (sortedNumbers == 0)
                arraylistInputs_0.add(sortedNumbers);
        else if (sortedNumbers > 0 )
            arraylistInputsPositive.add(sortedNumbers);
        else
            arraylistInputsNegative.add(sortedNumbers);

        arraylistInputsNegative.addAll(arraylistInputs_0);
        arraylistInputsNegative.addAll(arraylistInputsPositive);
        System.out.println(arraylistInputsNegative);



    }
}
