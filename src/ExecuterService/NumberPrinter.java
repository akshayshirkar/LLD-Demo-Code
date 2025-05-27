package ExecuterService;

public class NumberPrinter implements Runnable {
    int Number = 0;
    NumberPrinter(int num){
        this.Number = num;
    }

    @Override
    public void run() {
        System.out.println("Thread number "+Number);
        System.out.println(Thread.currentThread().getName());
    }
}
