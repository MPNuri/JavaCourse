package Day32._02_InstanceModifiers.PrivateModifier;

public class Cat {

    private String catName;

    public Cat() {
        catName = "nurimo";
    }

    private Cat(String catName) {
        this.catName = catName;
    }

    private void printCatName() {
        System.out.println(catName);
    }


    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
