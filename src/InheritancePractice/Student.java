package InheritancePractice;

public class Student extends Login {
    String studentName;
    String fName;
    String lName;
    String email;
    public Student(){
        fName="Akshay";
        lName = "Shirkar";
        email = "akshay@gmail.com";
    }
    public Student(String fName){
        this();
        this.fName = fName;
    }
    public Student(String fName, String lName){
        this(fName);
        this.lName = lName;
    }
    public Student(String fName, String lName, String email){
        this(fName, lName);
        this.email = email;
    }
}
