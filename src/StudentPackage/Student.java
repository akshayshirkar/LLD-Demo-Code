package StudentPackage;

public class Student {
    public String name;
    int age;
    protected double  problem_solving_percentage;

    public static void printName(String name){
        System.out.println(name);
    }

    public static void setName(String name){
        name = name.trim();
    }

    public String getName(){
        return name;
    }
}
