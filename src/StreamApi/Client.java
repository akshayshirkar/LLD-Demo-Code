package StreamApi;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
//        List<String> lstString = List.of("Akshay","prajakta");
//        List<String> strings = List.of("one","two","three","four");
//
//        var map = strings.stream()
//                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
//        map.forEach((key, value) -> System.out.println(key + " :: " + value));
//
//        System.out.println("map "+map);

//        List<String> lstFuits = List.of("Apple","Mango","Banana","Guvava");
//
//        // Converting the string into Stream
//        Stream<String> frutis = lstFuits.stream();

//        List<Integer> lstNumber =List.of(1,2,3,4,5,6,7,8,9);
//
//        // Convert the list into stream
//
//        List<Integer> lstFilterdNumbers = lstNumber.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
//        System.out.println(lstFilterdNumbers);

//        List<String> lstName = List.of("Akshay","Vishal","Dheeraj","Sushant");
//
//        List<String> lstSortedStrinng = lstName.stream().filter(name -> name.startsWith("A")).collect(Collectors.toUnmodifiableList());
//
//        System.out.println(lstSortedStrinng);

        List<Integer> lstNumber =List.of(1,2,3,4,5,6,7,8,9);

//        List<Integer> lstSqure = lstNumber.stream().map(number ->number *number).collect(Collectors.toList());

       // lstNumber.stream().map(num -> num * num).forEach(num -> System.out.println(num));

        // Following is the example for the paraller stream
//        lstNumber.parallelStream().forEach(num ->
//                System.out.println(num+" "+ Thread.currentThread().getName())
//
//        );

        Boolean  lstAllmatch = lstNumber.stream().allMatch(num-> num % 2 ==0);



    }


}
