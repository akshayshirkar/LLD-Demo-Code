package JavaGeneric;

public class Box<T> {
    T data;
    public void setData(T Data){
        this.data = Data;
    }
    public T getData(){
        return this.data;
    }

    // Create Generic method
    public static <T> void displayArray(T[] Array){
        for(T element : Array){
            System.out.println(element);
        }
    }
}
