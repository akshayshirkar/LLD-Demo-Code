package AdvanceJava.Generric;

public class pair <V,S> {
    private V firstVeriable;
    private S secoundVeriable;

    public pair(V FirstVeriable, S secondVeriable) {
        this.firstVeriable = FirstVeriable;
        this.secoundVeriable = secondVeriable;
    }
    public V getFirstVeriable(){
        return firstVeriable;
    }
    public S getSecoundVeriable(){
        return secoundVeriable;
    }
    // Following function is the generic function were veriable are avaialble at class level
    public static <T> void displayT(T val){
        System.out.println(val);
    }
}
