package Multithreading.ThreadPool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService ES1 = Executors.newFixedThreadPool(10);
        for(int i = 0;i<100;i++){
            NumberPrinter numberPrinterRef = new NumberPrinter(i);
            ES1.execute(numberPrinterRef);
        }
        ES1.shutdown();
    }
}
