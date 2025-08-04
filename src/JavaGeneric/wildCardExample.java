package JavaGeneric;

import java.util.List;

public class wildCardExample<T> {
    public static void print(List<? extends Number> list){
        for(Number n : list){
            System.out.println(n);
        }
    }
}
