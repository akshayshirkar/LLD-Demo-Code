package AdvanceJava.Generric;

public class pair2 <V,S> {
    private V firstVeriable;
    private S SecondVeriable;

    public pair2(V fristValue,S SecondValue){
        this.firstVeriable = fristValue;
        this.SecondVeriable = SecondValue;
    }
    public V getFirstVeriable(){
        return firstVeriable;
    }
    public S getSecondVeriable(){
        return SecondVeriable;
    }

}
