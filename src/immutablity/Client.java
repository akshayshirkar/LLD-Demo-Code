package immutablity;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        immutableEmployee emp = new immutableEmployee("Akshay",20);
        System.out.println(emp.getName());
        List<String> sub = new ArrayList<String>();
        sub.add("English");
        sub.add("Math");
        studentProfile stud1= new studentProfile("Akshay",12,sub);



    }
}
