package Interface;

public class Client {
    public static void main(String[] args) {
        runner r1 = new Dog();
        r1.run();

        runner r2 = new roboticdog();
        r2.run();
    }
}
