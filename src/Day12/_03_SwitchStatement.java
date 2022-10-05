package Day12;

import java.util.Scanner;

public class _03_SwitchStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rolenumber = scanner.nextInt();

        switch (rolenumber) { // the switch statement will only check equality of the case
            case 1:
                System.out.println("you are the admin");
                break;
            case 2:
                System.out.println("you are the teacher");
                break;
            case 3:
                System.out.println("you are a student");
            break;
            //if non matches the users input you may use default
            default:
                System.out.println("you are a guest");
            // don't forget break points when there is a correct case you are going to create every after points if there is no break.
                //for the default break is not necessary..

        }


        // when we type 1 for example. the switch will print you are the admin and move out of the switch
        // breaks are to stop execution, non break switch method will print infinite number of the input
        // lets see on if else statement

        if (rolenumber == 1) {
            System.out.println("you are admin");
        } else if (rolenumber == 2 ) {
            System.out.println("you are teacher");
        } else if (rolenumber == 3){
            System.out.println("you are student");
        } else
            System.out.println("you are guest");


    }
}
