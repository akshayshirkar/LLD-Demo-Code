package CoursePackage;

import StudentPackage.Student;

public class Cource extends Student {
    public Cource(String name) {
        super(name);
    }

    public void getinformation(){
        System.out.println(super.problem_solving_percentage);
        System.out.println("getinformation function is called");
    }
}

