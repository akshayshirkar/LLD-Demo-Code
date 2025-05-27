package ExecuterService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        //ExecutorService es = Executors.newFixedThreadPool(10);
        ExecutorService es = Executors.newCachedThreadPool();
        for(int i = 0;i<1000;i++){
            if(i == 40){
                continue;
            }
            NumberPrinter ns = new NumberPrinter(i);
            es.execute(ns);
        }
        es.shutdown();
    }
}
