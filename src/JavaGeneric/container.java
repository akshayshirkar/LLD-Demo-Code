package JavaGeneric;

public class container<T> {
    T value;
    public void setContainer(T value){
        this.value = value;

    }
    public T getContainer(){
        return this.value;
    }

    public static <T> void printArray(T[] Values){
        for( T valuesElement : Values){
            System.out.println(valuesElement);
        }
    }
}
