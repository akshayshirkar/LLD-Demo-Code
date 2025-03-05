package InheritancePractice;

public class InterfaceTwo implements InterfaceOne {
    @Override
    public void add() {
        System.out.println("Add Method");
    }

    @Override
    public void mul() {
        InterfaceOne.super.mul();
    }
}
