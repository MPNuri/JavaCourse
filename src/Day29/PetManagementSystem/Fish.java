package Day29.PetManagementSystem;

import java.util.Arrays;

public class Fish {
    String color;
    int age;
    String type;
    String[] listOfNeeds;

    Owner ownerInformation; // now instead of typing again we can store the same info in this bird class

    void printProperties() {

        System.out.println("color: " + color);
        System.out.println("Age: " + age);
        System.out.println("Type: " + type);
        System.out.println("list of needs: " + Arrays.toString(listOfNeeds));

    }
}