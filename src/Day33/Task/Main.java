package Day33.Task;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("murillo", 23);

        // System.out.println(student.age);
        // student.name = "Balan";
        // System.out.println(student.name);

        // these are unavailable because they are private --  anything named private only available in the same class

        student.setName("s");
        student.getName();

        System.out.println(student);







    }
}
