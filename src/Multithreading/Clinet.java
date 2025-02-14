package Multithreading;

public class Clinet {
    public static void main(String[] args) {
//        Task TaskRef = new Task();
//        Thread thread1 = new Thread(TaskRef);
//        thread1.start();
//        System.out.println(Thread.currentThread().getName()+" thread is runnning");
//
//        for(int i =0;i<1000;i++){
//            Thread thread2 = new Thread(TaskRef);
//            thread2.start();
//        }


//        for(int i = 0;i<100;i++){
//            NumberPrinter NumberPrinterRef = new  NumberPrinter(i);
//            Thread ThreadRef = new Thread(NumberPrinterRef);
//            ThreadRef.start();
//        }

        // This method is following the run time polymorphison
//        Thread t1 = new HelloPrinter();
//        t1.start();

        System.out.println("I am the main class");
        Adder adderRef = new Adder();
        Thread t1 = new Thread(adderRef);
        t1.start();

        Subtractor substractorRef = new Subtractor();
        Thread t2 = new Thread(substractorRef);
        t2.start();
    }
}
