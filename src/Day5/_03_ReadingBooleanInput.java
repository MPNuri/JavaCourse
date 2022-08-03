package Day5;

import java.security.KeyStore;
import java.util.Scanner;

public class _03_ReadingBooleanInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("are you a cat person");

        //scanner.nextBoolean();//this needs to be stored inside a variable

        boolean catperson = scanner.nextBoolean();
        System.out.println("you are a cat person");



















    }

}
