package Multithreading;

public class HelloPrinter extends Thread {
    @Override
    public void run() {
        System.out.println("Hello Akshay");
    }
}
