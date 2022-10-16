package Day31.Task_3;

public class Profile {

    String firstName;
    String lastName;
    String address;
    String birthDay;
    String phone;
    String email;
    String nickname;

    // Constructor 1
    public Profile(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Constructor 2
    public Profile(String firstName, String lastName, String birthDay) {
        this(firstName,lastName); // this is how we call a constructor from another constructor
        this.birthDay = birthDay;
    }

    // Constructor 3
    public Profile (String firstName, String lastName, String address, String birthDay,
                    String phone, String email, String nickname) {

        this(firstName, lastName, birthDay);
        // calling constructor 2. (we cannot call 2 or more constructor at a time)
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.nickname = nickname;
    }






}
