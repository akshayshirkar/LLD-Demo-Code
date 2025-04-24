package introToThread;

public class HelloWroldPrinter implements Runnable {
    @Override
    public void run(){
        System.out.println("Hello Wrold Printer");
        System.out.println(Thread.currentThread().getName());
    }
}
