package Multithreading;

public class NumberPrinter implements Runnable{
    int number;

    public NumberPrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Number is "+number);
    }
}
