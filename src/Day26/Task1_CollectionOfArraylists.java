package Day26;

import java.util.ArrayList;
import java.util.Collections;

public class Task1_CollectionOfArraylists {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> lists = new ArrayList<>();

        ArrayList<String> employees = new ArrayList<>();
        Collections.addAll(employees, "murillo", "MPN", "Mr white");

        ArrayList<String> emplloyeer = new ArrayList<>();
        Collections.addAll(emplloyeer, "Jessie", "rahip burinson", "rambo okan");

        ArrayList<String> companies = new ArrayList<>();
        Collections.addAll(companies, "Safran boya", "Prizma mimarlik", "Ikirenk yanpi");

        Collections.addAll(lists, emplloyeer, employees, companies);
        System.out.println(lists);










    }
}
