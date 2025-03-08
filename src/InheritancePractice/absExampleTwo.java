package InheritancePractice;

public class absExampleTwo extends absExampleOne {
    @Override
    public void display() {
        System.out.println("absExampleTwo");
    }

    @Override
    void drwa() {
        System.out.println("absExample draw");
    }

    @Override
    void get() {
        System.out.println("absExample get");
    }
}
