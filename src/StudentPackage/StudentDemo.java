package StudentPackage;

public class StudentDemo {
    public int age;
    public String name;

    public void display(){
        System.out.println("My name is"+name+". I am "+age+" years old");
    }

    public void sayHello(String name){
        System.out.println(name+" says hello to "+this.name);
    }
}
