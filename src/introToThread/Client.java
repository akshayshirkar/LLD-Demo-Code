package introToThread;

public class Client {
    public static void main(String[] args) {
        HelloWroldPrinter h1 = new HelloWroldPrinter();

        // Crete the thread instance

        Thread t1 = new Thread(h1);
        t1.start();
        System.out.println(Thread.currentThread().getName());
    }
}
