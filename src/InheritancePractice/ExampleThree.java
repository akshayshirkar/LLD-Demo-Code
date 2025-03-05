package InheritancePractice;

public class ExampleThree implements InterfaceWithStaticMethod {
    public static void printNumber(){
        System.out.println("The number is "+InterfaceWithStaticMethod.getNumber());
    }
}
