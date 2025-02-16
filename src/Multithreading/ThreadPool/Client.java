package Multithreading.ThreadPool;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService ES1 = Executors.newFixedThreadPool(10);
//        for(int i = 0;i<100;i++){
//            NumberPrinter numberPrinterRef = new NumberPrinter(i);
//            ES1.execute(numberPrinterRef);
//        }
//        ES1.shutdown();

        callableExample callableExampleRef = new callableExample();
        ExecutorService ES1 = Executors.newFixedThreadPool(10);
        Future<Integer> ans = ES1.submit(callableExampleRef);
        System.out.println("Ans is "+ans.get());
        ES1.shutdown();
    }
}
