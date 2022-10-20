package Day39;

public abstract class Animal {



    private String name;
    private int age;

    public Animal (String name, int age) {
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // Animals are too general thus we can't give any detail about the those different animals

    public abstract void eat(); // some animals eat different

    public abstract void sleep() ; // some animals sleep some dont

    public abstract void move() ; // some animals fly some walk



}
