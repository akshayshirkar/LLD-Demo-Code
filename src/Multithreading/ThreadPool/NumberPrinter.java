package Multithreading.ThreadPool;

public class NumberPrinter implements Runnable {
    int Number;
    public NumberPrinter(int i) {
        this.Number = i;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Number is "+Number);

    }
}
