package InheritancePractice;

public interface InterfaceOne {
    void add();
    default void mul(){
        System.out.println("mul");
    }
}
