package Day34.Task_1;

public class Student {

  /*  Create a class called Student with following private fields
    - Name (Read-only) - you should initialize this field with constructor
    - Age (Both Read and Write)
    - Country (Both Read and Write)
    - Grade (Both Read and Write)
   */

    private String name;
    private int age;
    private String country;
    private int grade;

    public Student (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getGrade() {
        return  grade;
    }

    private void setGrade(int grade) {
        this.grade = grade;
    }

}
