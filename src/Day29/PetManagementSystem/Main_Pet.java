package Day29.PetManagementSystem;

public class Main_Pet {
    public static void main(String[] args) {

        Bird eagle = new Bird(5);

        eagle.type = "Eagle";
        eagle.age = 10;
        eagle.setColor("black and white");



        // just like other variables this how we initialize Array variables
        // first name of the object and than = new (type of data) and inside [] amount

        eagle.listOfNeeds = new String[3];

        eagle.listOfNeeds [0] = "meat";
        eagle.listOfNeeds[1] = "water";
        eagle.listOfNeeds[2] = "cage";

        // lastly initializing owner info

        eagle.ownerInformation = new Owner();

        eagle.ownerInformation.ownerAge = 78;
        eagle.ownerInformation.ownerGender = "Male";
        eagle.ownerInformation.ownerName = "Murillo";

        eagle.printProperties(); /** since this will be printed in bird page we do not need sout method **/
        eagle.ownerInformation.printOwnerInfo(); // since this will be printed in bird page we do not



        /////////////////////////////////////////////////////////////////////////


        Fish nemo = new Fish();

        nemo.age = 1;
        nemo.color = "orange";
        nemo.type = "clownFish";

        nemo.listOfNeeds = new String[3];
        nemo.listOfNeeds[0] = "water";
        nemo.listOfNeeds[1] = "friend";
        nemo.listOfNeeds[2] = "food";

        nemo.printProperties();

        nemo.ownerInformation = new Owner();

        nemo.ownerInformation.ownerName = "MPN";
        nemo.ownerInformation.ownerGender = "Female";
        nemo.ownerInformation.ownerAge = 14;

        nemo.ownerInformation.printOwnerInfo();
























    }
}
