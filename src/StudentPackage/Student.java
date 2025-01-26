package StudentPackage;

public class Student {
    public String name;
    int age;
    protected double  problem_solving_percentage;

//    public Student(){
//        // This is constructor - use to construct the values.
//        /*
//        * This dosent include the retrun type.
//        * The name of the constructor should be same as the class name.
//        * Constructor cant be static.
//        * Constructor of the case gets initilize when the object of the that class is created.
//        * Eg. Student s1 = new Student() whill invoke the Student constructor.
//        * if we do not create the constructor for the class an system will create the empty constructor, that constructor will
//          gone away as soon as user creates the constructor.
//        * */
//
//        System.out.println("Student Empty constructor is called");
//        name = "Sunil";
//        age = 23;
//        problem_solving_percentage = 99.00;
//    }

    public Student(String name){
        System.out.println("Name is "+name);
    }

    public void printName(){
        System.out.println(name);
    }

    public static void setName(String name){
        name = name.trim();
    }

    public String getName(){
        return name;
    }
}
