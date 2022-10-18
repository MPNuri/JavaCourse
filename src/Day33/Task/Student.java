package Day33.Task;

public class Student {

   private String name;
   private int age;

   // Default Constructor
  //  Student() {}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    private Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
