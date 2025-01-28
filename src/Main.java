import CoursePackage.Cource;
import StudentPackage.Exam;
import StudentPackage.Student;
import StudentPackage.StudentDemo;

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

//        StudentDemo StudentDemoRef = new StudentDemo();
//        StudentDemoRef.name = "Akshay";
//        StudentDemoRef.age=22;
//
//        StudentDemoRef.sayHello("Sunil");

        Exam e1 = new Exam();
        e1.seatNumber = 12;
        e1.startDate = 1;
        e1.enddate = 2;
        e1.examName = "Semister";

        Exam e2 = new Exam(e1);
    }
}