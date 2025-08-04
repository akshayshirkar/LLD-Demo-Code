package JavaGeneric;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
//        Box<String> newBox = new Box<>();
//        newBox.setData("Hello");
//        System.out.println(newBox.getData());
//
//        String[] names = {"Akshay", "Prajakta"};
//        newBox.displayArray(names);

//         container<String> containerNew = new container<>();
//         containerNew.setContainer("Akshay");
//         System.out.println(containerNew.getContainer());
//
//         // Call generice methiod
//
//        container.printArray(new Integer[]{1, 2, 3});

//        List<Integer> list1 = Arrays.asList(1, 2, 3);
//        wildCardExample.print(list1);

          BookStore<String> book1 = new BookStore<>();
          book1.addBook("Code with force");
          book1.addBook("Java");
          book1.addBook("Python");
          book1.addBook("PHP");
          book1.addBook("JavaScript");
          book1.addBook("HTML5");
        System.out.println(book1.printAllBooks());
          book1.findBookByTitle("Java");
    }
}

