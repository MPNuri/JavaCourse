package Day25;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _01_TypeOfSet {
    public static void main(String[] args) {

        // HashSet -- unordered collection - ***** does not allow duplication *****
        // in other word prints unordered, hashset print codes the fastest way possible

        HashSet<String> countries = new HashSet<>();
        countries.add("France");
        countries.add("turkey");
        countries.add("usa");
        countries.add("germany");
        countries.add("russia");

        System.out.println(countries);


        // LinkedHashSet -- maintains insertion order - does not allow duplication
        LinkedHashSet<String> countriesLinkedHashSet = new LinkedHashSet<>();
        countriesLinkedHashSet.add("france");
        countriesLinkedHashSet.add("turkiye");
        countriesLinkedHashSet.add("kanada");
        countriesLinkedHashSet.add("mexico");
        countriesLinkedHashSet.add("paraguay");
        countriesLinkedHashSet.add("cockistan");

        System.out.println(countriesLinkedHashSet);


        // TreeSet --- ordered - it stores elements in ascending order
        // so cockistan is the first to be printed
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("france");
        treeSet.add("turkiye");
        treeSet.add("kanada");
        treeSet.add("mexico");
        treeSet.add("paraguay");
        treeSet.add("cockistan");

        System.out.println(treeSet);












    }
}
