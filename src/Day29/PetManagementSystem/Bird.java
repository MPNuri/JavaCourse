package Day29.PetManagementSystem;

import java.util.Arrays;

public class Bird {

    private String color;
    int age;
    String type;
    String[] listOfNeeds;

    Owner ownerInformation;

     Bird(int age) {
        this.age=age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void printProperties() {

        System.out.println("color: " + color);
        System.out.println("Age: " + age);
        System.out.println("Type: " + type);
        System.out.println("list of needs: " + Arrays.toString(listOfNeeds));








    }
















}
