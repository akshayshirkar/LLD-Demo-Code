package LamdaFunction;

import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
//        Runnable runableRef = new HelloWrold();
//        Thread threadRef = new Thread(runableRef);
//        threadRef.start();

//        Runnable runnableRef2 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Runable is called from the client");
//            }
//        };

        Runnable runableRef = () -> System.out.println("Hello World");
        Thread threadRef = new Thread(runableRef);
        threadRef.start();

//        Addition addRef = (a,b) -> a + b;
//        System.out.println(addRef.add(3,4));

//        CheckEven checkevenRef = (num) ->num % 2 == 0;
//        System.out.println("number is even: "+ checkevenRef.checkEven(2));

        // Lamda function using Stream
        List<String> frutis = List.of("Fruit", "Apple", "Banana","Akshay");

        List<String> SortetedFrutits = frutis.stream().filter(fruit ->fruit.startsWith("A")).collect(Collectors.toList());
        System.out.println(SortetedFrutits);


    }
}
