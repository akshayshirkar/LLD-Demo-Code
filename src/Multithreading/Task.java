package Multithreading;

public class Task implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("inside the task");
        System.out.println(Thread.currentThread().getName()+"  is runnning");
    }
}
