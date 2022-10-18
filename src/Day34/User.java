package Day34;

public class User {

    String userName;
    int password;
    String email;
    int userId;


    User(String userName, int password, String email) {
        userId =(int) (Math.random()*10000);
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    void checkValidity() {
        if (!email.equals("@")) {
            System.out.println("your credentials seems to be incorrect please create another user");
        }
    }

    void allPrinter() {
        System.out.print(("User Name" + userName) + ("Password" + password) );
        System.out.println( ("Your email:" + email) + ("User ID: " + userId));
    }




}
