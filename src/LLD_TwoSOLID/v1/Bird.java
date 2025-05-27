package LLD_TwoSOLID.v1;

abstract public class Bird {
    String name;
    String color;
    String category;

    public abstract void fly();
    public abstract void makeSound();

    public void eat(){
        System.out.println("bird can eat");
    }
}
