import CoursePackage.Cource;
import StudentPackage.Student;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        Student s1 = new Student();

//        s1.name = "Akshay";
//
//        s1.printName("Akshay");

        Cource c1 = new Cource("Akshay");
        c1.getinformation();
        //System.out.println(s1.problem_solving_percentage);
        // Protected data members cant be called in the same package.

        //System.out.println(s1.age); this is also not accesiable because defalut acess for the data members is private.

        // Call the constructor
        Student StudentRef = new Student("Akshay");
    }
}